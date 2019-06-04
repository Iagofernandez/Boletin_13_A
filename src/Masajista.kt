class Masajista(nome:String, apelidos:String,id:Int,idade:Int, var anosExperiencia:Int, var titulacion:String):Seleccion(nome, apelidos, id, idade) {
    override fun viaxar(){
        System.out.println("O maxasista que viaxa é"+super.nome)
    }
    fun darMasaxes(){}
    override fun toString():String{
return "o maxasista é:\n"+ super.toString() + "\naños experiencia=" + anosExperiencia + "\nTitulacion =" +titulacion
    }
}