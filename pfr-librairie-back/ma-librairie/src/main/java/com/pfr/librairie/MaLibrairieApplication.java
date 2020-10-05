package com.pfr.librairie;

import java.util.Collections;

import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.JspConfigDescriptorImpl;
import org.apache.tomcat.util.descriptor.web.JspPropertyGroup;
import org.apache.tomcat.util.descriptor.web.JspPropertyGroupDescriptorImpl;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MaLibrairieApplication implements WebMvcConfigurer {

    public static void main( String[] args ) {
        SpringApplication.run( MaLibrairieApplication.class, args );
    }

    @Bean
    public ModelMapper cdaModelMapper() {
        return new ModelMapper();
    }

    public void addResourceHandlers( ResourceHandlerRegistry registry ) {
        registry.addResourceHandler( "/css/**" ).addResourceLocations( "/css/" );
        registry.addResourceHandler( "/js/**" ).addResourceLocations( "/js/" );
        registry.addResourceHandler( "/jquery/**" ).addResourceLocations( "/jquery/" );
        registry.addResourceHandler( "/bootstrap/**" ).addResourceLocations( "/bootstrap/" );
        registry.addResourceHandler( "/font-awesome/**" ).addResourceLocations( "/font-awesome/" );
    }

    @Bean
    public ConfigurableServletWebServerFactory configurableServletWebServerFactory() {
        return new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext( Context context ) {
                super.postProcessContext( context );
                JspPropertyGroup jspPropertyGroup = new JspPropertyGroup();
                jspPropertyGroup.addUrlPattern( "*.jsp" );
                jspPropertyGroup.setScriptingInvalid( "true" );
                jspPropertyGroup.addIncludePrelude( "/WEB-INF/jsp/jstlLib.jsp" );
                jspPropertyGroup.setTrimWhitespace( "true" );
                jspPropertyGroup.setDefaultContentType( "text/html" );
                JspPropertyGroupDescriptorImpl jspPropertyGroupDescriptor = new JspPropertyGroupDescriptorImpl(
                        jspPropertyGroup );
                context.setJspConfigDescriptor( new JspConfigDescriptorImpl(
                        Collections.singletonList( jspPropertyGroupDescriptor ), Collections.emptyList() ) );
            }
        };
    }
}
