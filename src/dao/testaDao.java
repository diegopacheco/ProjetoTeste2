package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import modelo.Materiais;
import connection.ConnectionFactory;

public class testaDao {
	
	public static void main(String[] args) {
		Connection con = new ConnectionFactory().getConnection();
		try {
		    			
			MaterialDao dao = new MaterialDao();
			List<Materiais> materiais = dao.getList();
			
			for (Materiais material : materiais) {				
				  System.out.println("Codigo do Material: " + material.getCodMaterial());
				  System.out.println("C�digo do Idioma: " + material.getCodIdioma());
				  System.out.println("C�digo do Tipo do Material: " + material.getCodTipoMaterial());
				  System.out.println("T�tulo: " + material.getTitulo());
				  System.out.println("Subt�tulo: " + material.getSubtitulo());
				  System.out.println("Descricao: " + material.getDescricao());
				}
			
			//for (int i = 0; i < materiais.size()-1; i++) {
				//System.out.println("Codigo do Material: " + materiais.get(1).getCodMaterial());
				 // System.out.println("C�digo do Idioma: " + materiais.get(2).getCodIdioma());
				  //System.out.println("C�digo do Tipo do Material: " + materiais.get(3).getCodTipoMaterial());
//				  System.out.println("T�tulo: " + materiais.get(4).getTitulo());
//				  System.out.println("Subt�tulo: " + materiais.get(5).getSubtitulo());
//				  System.out.println("Descricao: " + materiais.get(6).getDescricao());
			//}
			
			con.close();
		} catch (SQLException e) {			
			e.printStackTrace();
			System.out.println("ERro");
		} 

						
		
	}

}
