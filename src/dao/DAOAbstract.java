 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u06731990108
 */
public abstract class DAOAbstract {

protected Connection cnt;
    
    public DAOAbstract() {
        try {
            // Carrega o driver do MySQL 8
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/db_joao_escobar";
            String user = "root";
            String pass = "root";
            cnt = DriverManager.getConnection(url, user, pass);

            // Cria a conexão
            cnt = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão estabelecida com sucesso!");

        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar com o banco: " + e.getMessage());
        }
            
    }
       
    
    public abstract void insert(Object object);
    public abstract void update(Object object);
    public abstract void delete(Object object);
    public abstract Object list(int id);    
    public abstract Object listAll();  

};
