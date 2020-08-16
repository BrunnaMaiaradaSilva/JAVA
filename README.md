# JAVA :octocat:


### Arbyte Turma 3 - Backend Java :rocket: :zap:

## Um pouco da história do JAVA

Java é uma linguagem de programação [orientada a objetos](https://pt.wikipedia.org/wiki/Orienta%C3%A7%C3%A3o_a_objetos) desenvolvida na década de 90 por uma equipe de programadores chefiada por [James Gosling](https://pt.wikipedia.org/wiki/James_Gosling), na empresa Sun Microsystems. Em 2008 o Java foi adquirido pela empresa Oracle Corporation. Diferente das linguagens de programação modernas, que são compiladas para código nativo, a linguagem Java é compilada para um bytecode que é interpretado por uma máquina virtual (Java Virtual Machine, mais conhecida pela sua abreviação JVM).

Em 1991, na Sun Microsystems, foi iniciado o Green Project, o berço do Java, uma linguagem de programação orientada a objetos. Os mentores do projeto eram Patrick Naughton, Mike Sheridan, e James Gosling. Eles acreditavam que, eventualmente, haveria uma convergência dos computadores com os equipamentos e eletrodomésticos frequentemente usados pelas pessoas no seu dia-a-dia.

Para provar a viabilidade desta ideia, 13 pessoas trabalharam arduamente durante 18 meses. No verão de 1992 eles emergiram de um escritório de Sand Hill Road, no Menlo Park, com uma demonstração funcional da ideia inicial. O protótipo se chamava *7 (lê-se “Star Seven”), um controle remoto com uma interface gráfica touchscreen. Para o *7, foi criado um mascote, hoje amplamente conhecido no mundo Java, o Duke. O trabalho do Duke no *7 era ser um guia virtual ajudando e ensinando o usuário a utilizar o equipamento. O *7 tinha a habilidade de controlar diversos dispositivos e aplicações. James Gosling especificou uma nova linguagem de programação para o *7. Gosling decidiu batizá-la de “Oak”, que quer dizer carvalho, uma árvore que ele podia observar quando olhava através da sua janela.

![Tumble](https://user-images.githubusercontent.com/45864414/90345135-19bcb300-dff5-11ea-81f9-d2a166b82088.png)

### Características 

A linguagem Java foi projetada tendo em vista os seguintes objetivos:

*  Orientação a objetos - Baseado no modelo de Simular;
*  Portabilidade - Independência de plataforma - "escreva uma vez, execute em qualquer lugar" ("write once, run anywhere");
*  Recursos de Rede - Possui extensa biblioteca de rotinas que facilitam a cooperação com protocolos TCP/IP, como HTTP e FTP;
*  Segurança - Pode executar programas via rede com restrições de execução.

 **Além disso, podem-se destacar outras vantagens apresentadas pela linguagem:**
*  Sintaxe similar a C/C++
*  Facilidades de Internacionalização - Suporta nativamente caracteres Unicode;
*  Simplicidade na especificação, tanto da linguagem como do "ambiente" de execução (JVM);
*  É distribuída com um vasto conjunto de bibliotecas (ou APIs);
*  Possui facilidades para criação de programas distribuídos e multitarefa (múltiplas linhas de execução num mesmo programa);
*  Desalocação de memória automática por processo de coletor de lixo;
*  Carga Dinâmica de Código - Programas em Java são formados por uma coleção de classes armazenadas independentemente e que podem ser carregadas no momento de utilização.

### Exemplos de código

**Método main**
O método main é onde o programa inicia. Pode estar presente em qualquer classe. Os parâmetros de linha de comando são enviados para o array de Strings chamado args.

```
public class OláMundo {
   /**
* Método que executa o programa
* public = É visto em qualquer lugar da aplicação. É o modificador de acesso
* static = é iniciado automaticamente pela JVM, sem precisar de uma instância
* void = Método sem retorno (retorno vazio)
* main = Nome do método, que é obrigatório ser este para que seja executado como o método principal da aplicação. A aplicação só pode ter um método denominado main. Recebe como parâmetro um array de String.
* String[] args = Array de argumentos que podem ser repassados na chamada do programa.
* /
   public static void main(String[] args) {
      System.out.println("Olá, Mundo!"); //Imprime na tela a frase
   }
}
```
