// package com.pfr.librairie.connexion;
//
// import java.sql.Connection;
// import java.sql.SQLException;
//
// import javax.activation.DataSource;
//
// public class MyConnexion {// nous retourne la connexion à la bdd
//
// private static Connexion connexion = null;
//
// private MyConnexion() {
// DataSource dataSource = MyDataSourceFactory.getMariaDb();
//
// try {
// connexion = dataSource.getConnexion();
// System.out.println("connect�");
// } catch (SQLException e) {
// e.printStackTrace();
// }
// }
//
// public static Connection getConnexion() {
// if (connexion == null) {
// new MyConnexion();
// }
// return connexion;
// }
// }
// }
