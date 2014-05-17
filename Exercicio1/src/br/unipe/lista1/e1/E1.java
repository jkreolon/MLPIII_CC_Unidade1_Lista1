package br.unipe.lista1.e1;
/**
* Resposta da quest�o 1;
* 
* Para um melhor entendimento irei dividir o processo de compila��o e execu��o em 5 etapas.
* 
* 1- Edi��o/Cria��o: Nesta fase se d� a cria��o ou edi��o de arquivos onde ser�o inseridos os c�digos
* dos programadores e ficar�o armazenados em um arquivo com a extens�o .java, esses arquivos podem ser
* gerados com um simples bloco de notas(basta haver um compilador gcc) ou IDE�s espec�ficas para a 
* linguagem JAVA
* 
* 2- Compila��o do programa Java em Bytecodes.
* Supondo que em um exemplo geramos um aquivo chamado "Ola.java", na hora da compila��o, o compilador
* produz um arquivo ".class" chamado "Ola.class" onde cont�m a vers�o compilada. O compilador Java
* converte o c�digo-fonte em bytecodes que representam tarefas a serem executadas na fase de execu��o.
* Os bytecodes s�o executados pela Java Virtual Machine(JVM) - uma parte do JDK e a base da plataforma
* Java.
* 
* A M�quina Virtual(Virtual Machine- VM) � um aplicativo software que simula um computador, mas oculta o 
* o sistema operacional e o hardware subjacente dos programas que interagem com ela, o que garante a
* possibilidade de execu��o de programas Java em v�rios sistemas operacionais distintos.
*
* 3- Carregando um programa na mem�ria.
* A JVM armazena o programa na mem�ria para execut�-lo, efetuando o carregamento, o carregador de classes
* da JVM pega os arquivos ".class" que cont�m os bytecodes do programae os transfere para a mem�ria 
* prim�ria.
* O carregador da classe l� os bytecodes e os aloca na mem�ria.
* 
* 4- Verifica��o de bytecode
* Enquanto as classes s�o carregadas, o verificador examina seus bytecodes para assegurar que s�o v�lidos
* e n�o violam restri��es de seguran�a do Java
* 
* 5- Execu��o
* As JVMs executam bytecodes utilizando uma combina��o de interpreta��o chamada compila��o JIT(Just in Time)
* conhecido como compilador Java HotSpot.
* O Java HotSpot traduz os bytecodes para a linguagem de m�quina, quando o JVM encontra novamente essas
* partes compiladas, o c�digo de linguagem de m�quina � executado mais r�pido.
* Em outras palavras o programa Java passa por duas fases de compila��o que s�o
*  -Quando o c�digo-fonte � traduzido em bytecodes que acaba tendo uma portabilidade entre JVM�s em 
*  diferentes plataformas do computador.
*  -E a outra � durante a execu��o, os bytecodes s� traduzidos em liguagem de m�quina para o computador
*  real em que o programa � executado.
* 
* @author Jean Kunert Reolon
*
*/
public class E1 {

}
