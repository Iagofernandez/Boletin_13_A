open class Seleccion(var nome:String, var apelidos:String, var id:Int, var idade:Int){
    fun concentrarse(){
        System.out.println("Concentrase coa seleccion")
    }
    open fun  viaxar(){
        System.out.println("Viaxa a seleccion")
    }

    override fun toString(): String {
        return "Nome=$nome\nApelidos=$apelidos\nId=$id\nIdade=$idade"
    }
}
