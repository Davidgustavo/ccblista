package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ListaRegional {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ListaRegional
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.database.Operations.query(Var.valueOf("app.entity.Listaservicos"),Var.valueOf("select l.regional.regional_nome, l.dataehora, l.eventos.evento_nome, l.atende1.membro_nomecurto, l.localevento.comum_nome from Listaservicos l where l.regional.regional_nome = \'RGE Campinas SP\'"));
    return item;
   }
 }.call();
}

}

