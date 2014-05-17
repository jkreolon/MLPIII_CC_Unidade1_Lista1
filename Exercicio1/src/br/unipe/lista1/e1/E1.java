package br.unipe.lista1.e1;
/**
* Resposta da questão 1;
* 
* Para um melhor entendimento irei dividir o processo de compilação e execução em 5 etapas.
* 
* 1- Edição/Criação: Nesta fase se dá a criação ou edição de arquivos onde serão inseridos os códigos
* dos programadores e ficarão armazenados em um arquivo com a extensão .java, esses arquivos podem ser
* gerados com um simples bloco de notas(basta haver um compilador gcc) ou IDE´s específicas para a 
* linguagem JAVA
* 
* 2- Compilação do programa Java em Bytecodes.
* Supondo que em um exemplo geramos um aquivo chamado "Ola.java", na hora da compilação, o compilador
* produz um arquivo ".class" chamado "Ola.class" onde contém a versão compilada. O compilador Java
* converte o código-fonte em bytecodes que representam tarefas a serem executadas na fase de execução.
* Os bytecodes são executados pela Java Virtual Machine(JVM) - uma parte do JDK e a base da plataforma
* Java.
* 
* A Máquina Virtual(Virtual Machine- VM) é um aplicativo software que simula um computador, mas oculta o 
* o sistema operacional e o hardware subjacente dos programas que interagem com ela, o que garante a
* possibilidade de execução de programas Java em vários sistemas operacionais distintos.
*
* 3- Carregando um programa na memória.
* A JVM armazena o programa na memória para executá-lo, efetuando o carregamento, o carregador de classes
* da JVM pega os arquivos ".class" que contêm os bytecodes do programae os transfere para a memória 
* primária.
* O carregador da classe lê os bytecodes e os aloca na memória.
* 
* 4- Verificação de bytecode
* Enquanto as classes são carregadas, o verificador examina seus bytecodes para assegurar que são válidos
* e não violam restrições de segurança do Java
* 
* 5- Execução
* As JVMs executam bytecodes utilizando uma combinação de interpretação chamada compilação JIT(Just in Time)
* conhecido como compilador Java HotSpot.
* O Java HotSpot traduz os bytecodes para a linguagem de máquina, quando o JVM encontra novamente essas
* partes compiladas, o código de linguagem de máquina é executado mais rápido.
* Em outras palavras o programa Java passa por duas fases de compilação que são
*  -Quando o código-fonte é traduzido em bytecodes que acaba tendo uma portabilidade entre JVM´s em 
*  diferentes plataformas do computador.
*  -E a outra é durante a execução, os bytecodes sã traduzidos em liguagem de máquina para o computador
*  real em que o programa é executado.
* 
* @author Jean Kunert Reolon
*
*/
public class E1 {

}
