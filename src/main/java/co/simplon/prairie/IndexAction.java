package co.simplon.prairie;

import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;

import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;


@MadvocAction
public class IndexAction {
static String databaseUrl = "jdbc:oracle:thin:SIMPLON/SIMPLON@localhost:1521:XE";

static String requeteSql = "select NAME from TEAMS where CITY='San Francisco'";

    @Out
    String prenom;
    @Out
    String nom;

    @Action("/")
    public String view () throws Exception{
        prenom = "Claude";
     
		DriverManager.registerDriver(new OracleDriver());

        Connection connexion = DriverManager.getConnection(databaseUrl);
        Statement requete = connexion.createStatement();
        ResultSet resultat = requete.executeQuery(requeteSql);
        while (resultat.next()) {
            nom = resultat.getString("NAME");
            System.out.println(nom);
        }
        resultat.close();
        requete.close();
        connexion.close();
    	return "/index";   
    }
}