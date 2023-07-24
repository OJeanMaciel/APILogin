Sistema de Login - Backend (Java 17)

Este é o backend do sistema de login desenvolvido em Java 17, que oferece recursos seguros e eficientes para autenticação de usuários.

# 📝 Configurações: Start do Projeto

- Antes de executar o backend, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:
- Java Development Kit (JDK) 17 ou superior
- PostgreSQL (ou outro banco de dados compatível)

# 📝 Configurações: Banco de Dados

1. Certifique-se de ter um banco de dados PostgreSQL instalado e em execução.
2. Crie um banco de dados específico para o sistema de login.
3. No arquivo application.properties, configure as informações do banco de dados:

- spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco_de_dados
- spring.datasource.username=seu_usuario
- spring.datasource.password=sua_senha

# Executando o Backend

Após configurar o banco de dados, você pode iniciar o servidor backend:

1. Navegue até o diretório do projeto: 
2. Compile o projeto:
3. Execute o arquivo .class:


# 🚦 API Docs

# Endpoints

O sistema de login oferece os seguintes endpoints para interação:

1. /api/login
- Método: POST
- Descrição: Realiza a autenticação do usuário com base nas credenciais fornecidas (como nome de usuário e senha).
- Resposta: Retorna um token de autenticação em caso de sucesso ou uma mensagem de erro em caso de falha na autenticação.

2. /api/usuarios
- Método: POST
- Descrição: Cria um novo usuário no sistema.
- Resposta: Retorna uma mensagem de sucesso em caso de criação bem-sucedida do usuário ou uma mensagem de erro se houver algum problema.

# 🚦 Tecnologias Utilizadas
- Java 17
- Spring Boot (versão x.x.x) para criação da API
- PostgreSQL (ou outro banco de dados compatível)
