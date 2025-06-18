/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysql.mavenproject3;

/**
 *
 * @author guilh
 */
public class PessoaDAO {

    public void cadastrarPessoa(Pessoa pessoa) {
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement( "INSERTINTO pessoa (nome) VALUES( ?)")) {stmt.setString(1, pessoa.getNome());stmt.executeUpdate();
        }
    }
}
