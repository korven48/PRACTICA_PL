package ast.Instructions;

import ast.Expresions.LlamadaFunExp;

public class LlamadaFunInst extends Instruccion {
    private LlamadaFunExp funcion;

    public LlamadaFunInst(LlamadaFunExp funcion){
        this.funcion = funcion;
    }

    public KindInstruction kind() {
        return KindInstruction.FUNCALL;
    }

    public String toString(){
        return "Llamada (" + funcion.toString() + ")";
    }
}