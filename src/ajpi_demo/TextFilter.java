/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajpi_demo;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class TextFilter extends FileFilter{

    @Override
    public boolean accept(File file)
    {
        if(file.getAbsolutePath().endsWith(".txt")
                ||file.getAbsolutePath().endsWith(".java")
                ||file.getAbsolutePath().endsWith(".html")
                    ||file.isDirectory())
        {
            return true;
        }
        else
        {
                return false;
        }
 
    }

    @Override
    public String getDescription() {
        return "text files";
    }
    
}
