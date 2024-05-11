package br.com.alura.comex;


public class TesteProduto {
public static void main(String[] args) {
    System.out.println("Teste do Produto");

    Produto livro = new Produto();
    livro.nome = "livro Branca de neve";
    livro.descricao = "livro brochura";
    livro.quantidade = 25;
    livro.precoUnitario = 25.21;

    Produto2 caderno = new Produto2();
    caderno.setNome("caderno Tilibra");
    caderno.setDescricao("descricao = espiral"); 
    caderno.setQuantidade(20);
    caderno.setPrecoUnitario(null);

    if(livro == caderno){
        System.out.println("São iguais");
    }else{
        System.out.println("São diferentes");
    }

    //compara objetos
    if(livro.equals(caderno)){
        System.out.println("São iguais");
    }else{
        System.out.println("São diferentes");
    }

    System.out.println(livro);//ou
    System.out.println(livro.toString());
     //nao mostra, só mostra endereço de memoria. Precisa do ToString na classe Produto
    System.out.println(caderno);//ou

    //com acesso restrito dos atributos(Class Produto2)
    Produto2 livro1 = new Produto2();
    livro1.setNome("livro Branca de neve");
    livro1.setDescricao("livro brochura");
    livro1.setQuantidade(25);
    livro1.setPrecoUnitario(25.21);


    System.out.println(livro1);


}



}
