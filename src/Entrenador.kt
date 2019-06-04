class Entrenador(nome:String, apelidos: String, id:Int, idade:Int, var idFederacion:String):Seleccion(nome, apelidos, id, idade) {
    private fun dirixirPartido(){}
    private fun dirixirAdestramento(){}
    override fun viaxar(){
        System.out.println("O adestrador que viaxa é:"+super.nome!!)
    }
}