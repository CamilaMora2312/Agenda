import javax.swing.*;
import java.awt.event.*;

public class Ingreso extends JFrame{
    JPanel panel;
    JButton btnIngresar, btnSalir, btnLimpiar;
    JTextField txtUsuario;
    JPasswordField contraseņa;
    JLabel lblUsuario;
    JLabel lblContraseņa;
  
    public Ingreso(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(280, 180); 
      JLabel lblUsuario = new JLabel("Usuario");
      txtUsuario = new JTextField(20);
      JLabel lblContraseņa = new JLabel("Contraseņa");
      contraseņa = new JPasswordField(20);
      
      btnIngresar = new JButton ("Ingresar");
      btnLimpiar = new JButton("Limpiar");
      btnSalir = new JButton("Salir");
      
      btnIngresar.addMouseListener(new Ingresar());
      btnLimpiar.addMouseListener(new Limpiar());
      btnSalir.addMouseListener(new Salir());

      
      panel = new JPanel();
      setTitle("Agenda de Diego Alatorre");
      panel.add(lblUsuario);
      panel.add(txtUsuario);
      panel.add(lblContraseņa);
      panel.add(contraseņa);
      panel.add(btnIngresar);
      panel.add(btnLimpiar);
      panel.add(btnSalir);
      setContentPane(panel);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
    }
    
    private void cerrar(){
      setVisible(false);
    }
    
    private class Ingresar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         String usuario = txtUsuario.getText();
         String password = new String(contraseņa.getPassword());
         
             if(usuario.isEmpty() && password.isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y la contraseņa");
                txtUsuario.requestFocus();
              
              }else{
          
                 if(usuario.equals("1") && password.equals("1")){
                 
                   JOptionPane.showMessageDialog(null, "Bienvenido a la agenda de Diego Alatorre");
                   cerrar();
                   Menu m = new Menu();
                }else{
        
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseņa son incorrectos !!!", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtUsuario.setText(null);
                    contraseņa.setText(null);
                    txtUsuario.requestFocus();
                 }
              }
           }
        }
      
  
  
  
   private class Limpiar extends MouseAdapter{
       public void mouseClicked(MouseEvent event){
         txtUsuario.setText(null); 
         contraseņa.setText(null);
         txtUsuario.requestFocus();
       }
   }
  
   private class Salir extends MouseAdapter{
     public void mouseClicked(MouseEvent event){

         JOptionPane.showMessageDialog(null, "Diego Alatorre Diaz ;)","PROGRAMADOR", JOptionPane.WARNING_MESSAGE);
         System.exit(0);
      
    }
  }

}
