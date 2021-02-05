

import javax.swing.JOptionPane;

public class OdtuFirstAssignment {
    
    

    
    public static void main(String[] args) 
    {
        double Hworkone,Hworktwo,MidtermExam,FinalExam,Average;
        String Data1,Data2,Data3,Data4;        
                    
        
        while (true) {
            Data1= JOptionPane.showInputDialog("Please enter first homework grade: "); 
            Hworkone=Double.parseDouble(Data1);
            Data2= JOptionPane.showInputDialog("Please enter second homework grade: ");
            Hworktwo=Double.parseDouble(Data2);
            Data3= JOptionPane.showInputDialog("Please enter midterm exam grade: ");
            MidtermExam=Double.parseDouble(Data3);
            Data4= JOptionPane.showInputDialog("Please enter final exam grade: "); 
            FinalExam=Double.parseDouble(Data4);           
            
            
            if (Hworkone>100||Hworktwo>100||MidtermExam>100||FinalExam>100)             
                {
                    JOptionPane.showMessageDialog(null, "Please check the grades your enter","Error",JOptionPane.OK_OPTION);              
                    
                }
            else
                {
                    Average=(Hworkone+Hworktwo)*0.10+MidtermExam*0.30+FinalExam*0.50;
                    JOptionPane.showMessageDialog(null, "Average: " + Average);
                    break;
                 }
            
        }
            
        
            
        
        
        
        
        
        



        
                
        
        
        
    }
    
}
