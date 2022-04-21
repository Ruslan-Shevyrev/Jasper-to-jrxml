/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruslanshevyrev.jasper2jrxml;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlWriter;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;

import java.io.File;

/**
 *
 * @author Shevyrev Ruslan
 */
public class ConvertJasper2JRXML {
    public static String sourcePath, outputPath, xml;
    public static JasperDesign jd  = new JasperDesign(); 

    public void convert(String JASPER, String JRXML) throws JRException{ 

      sourcePath = "C:\\1\\ACT_COMPL.JASPER";

      sourcePath = JASPER;
 
      outputPath = "C:\\1\\ACT_COMPL.jrxml";

      outputPath = JRXML+ "\\ACT_COMPL.jrxml";
      File file = new File(sourcePath);

      JasperReport report = (JasperReport) JRLoader.loadObject(file);
      JRXmlWriter.writeReport(report, outputPath, "UTF-8");
    }
    
}
