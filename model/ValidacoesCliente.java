package model;

import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class ValidacoesCliente {
	public static boolean validarNome(String nome, JLabel codigo_lbl) {
        if (nome.isEmpty() || nome.length() < 4) {
        	codigo_lbl.setForeground(new Color(204, 0, 0));
            return false;
        } else {
        	codigo_lbl.setForeground(new Color(0, 204, 0));
            return true;
        }
    }
	
	public static boolean validarEmail(String email, JLabel email_lbl) { //falta esse cara aqui ainda
        if (email.isEmpty() || email.length() < 4) {
        	email_lbl.setForeground(new Color(204, 0, 0));
            return false;
        } else {
        	email_lbl.setForeground(new Color(0, 204, 0));
            return true;
        }
    }
	
	public static boolean validarSenha(String senha, JLabel senha_lbl) {
        if (senha.isEmpty() || senha.length() < 4) {
        	senha_lbl.setForeground(new Color(204, 0, 0));
            return false;
        } else {
        	senha_lbl.setForeground(new Color(0, 204, 0));
            return true;
        }
    }
	
	public static boolean validarStatus(String status, JLabel status_lbl) {
		if(!status.isEmpty()) {
			int statusInt = Integer.parseInt(status);
			if (statusInt < 0 || statusInt > 1) {
				status_lbl.setForeground(new Color(204, 0, 0));
				return false;        	
			} else {
				status_lbl.setForeground(new Color(0, 204, 0));
				return true;
			}
		}else {
			status_lbl.setForeground(new Color(204, 0, 0));
			return false;			
		}
    }

	public static boolean validarDataNascimento(String dia, String mes, String ano, JLabel nascimento_lbl) {
	    if (dia.isEmpty() || mes.isEmpty() || ano.isEmpty()) {
	    	nascimento_lbl.setForeground(new Color(204, 0, 0));
	        return false;
	    }

	    try {
	        int diaInt = Integer.parseInt(dia);
	        int anoInt = Integer.parseInt(ano);

	        if (diaInt < 1 || diaInt > 31 || anoInt < 1900 || anoInt > 2030) {
	        	nascimento_lbl.setForeground(new Color(204, 0, 0));
	            return false;
	        }

	        nascimento_lbl.setForeground(new Color(0, 204, 0));
		    
	        return true;
	    } catch (NumberFormatException e) {
	    	nascimento_lbl.setForeground(new Color(204, 0, 0));
	        return false;
	    }
	}
	
    public static boolean validarFoto(JFileChooser fileChooser, JLabel imagem_lbl) {
        if (fileChooser.getSelectedFile() != null) {
        	imagem_lbl.setForeground(new Color(0, 204, 0));
            return true;
        } else {
            return true;
        }
    }
}
