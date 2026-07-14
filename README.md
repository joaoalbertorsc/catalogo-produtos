# Catálogo de Produtos em Java ☕

## 📝 Sobre o Projeto

Este repositório contém um sistema de **Catálogo de Produtos** desenvolvido em Java. O projeto tem como objetivo principal demonstrar a modelagem de domínio voltada para o contexto de varejo ou e-commerce, implementando o gerenciamento do ciclo de vida dos itens através de operações fundamentais de manipulação de dados.

O foco é fornecer uma base sólida de como estruturar entidades de negócio, gerenciar estoques ou preços, e organizar a arquitetura do projeto para que seja escalável e de fácil manutenção.

## 💡 Principais Conceitos Abordados

* **Modelagem de Domínio:** Estruturação de classes consistentes (como `Produto`, `Categoria`, etc.) utilizando os princípios da Orientação a Objetos para representar entidades do mundo real.
* **Operações CRUD:** Implementação das quatro operações básicas de armazenamento persistente ou em memória: *Create* (Criar), *Read* (Ler/Listar), *Update* (Atualizar) e *Delete* (Remover).
* **Gerenciamento de Coleções e Filtros:** Aplicação de lógicas de busca e filtragem de produtos (por exemplo, buscar por nome, categoria ou faixa de preço) utilizando as estruturas de dados do Java.
* **Arquitetura e Separação de Responsabilidades:** Divisão clara entre as camadas de modelo, repositório (armazenamento de dados) e regras de negócio.

## 🛠️ Tecnologias Utilizadas

* Java (versão 17 ou superior recomendada)
* Maven (gerenciador de dependências e build)

---

## 🚀 Como Executar o Projeto

Você pode testar as operações do catálogo rodando o projeto diretamente pelo terminal ou utilizando o ambiente visual da sua IDE.

### 📋 Pré-requisitos

Certifique-se de ter em sua máquina:

* **Java JDK** (versão 17 ou superior) configurado nas variáveis de ambiente (`JAVA_HOME`).
* **Apache Maven** instalado (ou utilize o Maven Wrapper `./mvnw` incluso no repositório).

### 💻 Opção 1: Executando pelo Terminal (Sem IDE)

Para compilar o código e interagir com o catálogo via linha de comando:

1. **Clone o repositório:**
```bash
git clone https://github.com/joaoalbertorsc/catalogo-produtos.git
cd catalogo-produtos

```


2. **Compile o projeto:**
Execute o Maven para baixar as dependências e gerar os arquivos compilados:
```bash
mvn clean compile

```


3. **Execute a aplicação:**
* Se a classe principal já estiver configurada no arquivo `pom.xml`, basta rodar:
```bash
mvn exec:java

```


* Caso precise apontar explicitamente qual classe contém o método `main` (substitua o caminho pelo pacote correto do projeto):
```bash
mvn exec:java -Dexec.mainClass="com.seuprojeto.Main"

```




4. **Execute os Testes Unitários:**
Para validar se as regras de negócio e as operações CRUD estão funcionando como esperado:
```bash
mvn test

```



### 🖥️ Opção 2: Executando via IDE (IntelliJ IDEA, Eclipse, VS Code)

Para uma experiência mais interativa e facilitar a visualização da arquitetura do projeto:

1. **Importar o Projeto:**
* Abra a sua IDE.
* Selecione a opção **Open** ou **Import Project**.
* Navegue até a pasta clonada e selecione o arquivo `pom.xml`. A IDE reconhecerá as configurações do Maven automaticamente.


2. **Executar:**
* Localize a classe de entrada do sistema (geralmente chamada de `Main` ou `Application` dentro da pasta `src/main/java`).
* Clique com o botão direito sobre ela e selecione **Run**.


3. **Explorar e Modificar:**
* Adicione novos atributos à classe `Produto` ou crie novos filtros de busca para praticar a extensão das funcionalidades do catálogo.



---

## 👨‍💻 Autor

**João Alberto** – Engenheiro de Software

---

*Se este projeto te ajudou a compreender melhor a estruturação de um sistema de catálogo em Java, sinta-se à vontade para deixar uma ⭐ no repositório!*
