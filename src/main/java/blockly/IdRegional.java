package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class IdRegional {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// IdRegional
public static Var IdRegional() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.dynCombobox7279"));
    System.out.println(item.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("Listaservicos.active.regional"), item);
    return item;
   }
 }.call();
}

}

