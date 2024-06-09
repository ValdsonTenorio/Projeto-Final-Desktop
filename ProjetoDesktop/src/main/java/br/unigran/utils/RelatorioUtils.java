package br.unigran.utils;

import br.unigran.persistence.Dao;
import net.sf.jasperreports.engine.*;

import java.sql.Connection;
import java.util.Map;

public class RelatorioUtils {
    public static JasperPrint relatorio(String lugar, Map<String, Object> parametros) throws JRException {
        Dao.getInstace().getEm().getTransaction().begin();
        Connection con = Dao.getInstace().getEm().unwrap(Connection.class);
        JasperReport report = JasperCompileManager.compileReport(RelatorioUtils.class.getClassLoader().getResource(lugar).getFile());
        JasperPrint print = JasperFillManager.fillReport(report, parametros, con);
        Dao.getInstace().getEm().getTransaction().commit();
        return print;
    }
}
