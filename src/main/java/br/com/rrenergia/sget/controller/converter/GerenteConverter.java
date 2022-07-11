package br.com.rrenergia.sget.controller.converter;
import br.com.rrenergia.sget.model.Gerente;
import org.springframework.core.convert.converter.Converter;
import org.thymeleaf.util.StringUtils;

public class GerenteConverter implements Converter<String, Gerente> {

    @Override
    public Gerente convert(String codigo) {
        if(!StringUtils.isEmpty(codigo)){
            Gerente gerente = new Gerente();
            gerente.setCodigo(Long.valueOf(codigo));
            return gerente;
        }
        return null;
    }
}


