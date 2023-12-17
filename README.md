# ICHORDS

O iChords é um aplicativo de aprendizado de violão concebido e implementado no Android Studio, utilizando a linguagem Kotlin. O iChords oferece uma abordagem educativa através de lições, proporcionando uma maneira envolvente e eficaz de desenvolver e aprimorar suas habilidades musicais no violão, sendo assim destinado a indivíduos interessados em aprimorar suas habilidades independentemente do nível de experiência. Este aplicativo visa tornar a jornada de aprendizado do violão acessível e inspiradora para todos os usuários.

## Funcionalidade desenvolvida

### Tela de instrução
A disponibilidade de uma tela com instruções básicas para seguir as lições de modo mais eficaz e sem complicações. Nela você aprende como segurar o violão, aprende sobre a posição e a nomeclatura do dedos, o que é necessário saber quando se usa tablatura por exemplo e aprender sobre os acordes em si o que facilita quando você abre o aplicativo e segue os acordes na tela. Não fica presente na tela o tempo todo para não incomodar o usuário e é acionado somente se necessário.


## Requisito do Sistema

- Dispositivo Android com sistema operacional 5.0 ou superior.

# Guia de Instalação do Projeto no Android Studio

Este guia fornece instruções passo a passo sobre como instalar e configurar o projeto no Android Studio.

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes pré-requisitos instalados em seu sistema:

- [Android Studio](https://developer.android.com/studio)
- [Git](https://git-scm.com/)
- Acesso à Internet

## Passo 1: Clonar o Repositório

Abra o terminal e navegue até o diretório em que você deseja clonar o projeto. Execute o seguinte comando para clonar o repositório do projeto:

bash
git clone https://github.com/MariliaCarv/ichords.git


## Passo 2: Abrir o Projeto no Android Studio

Abra o Android Studio.
Clique em "File" (Arquivo) no menu principal.
Selecione "Open" (Abrir).
Navegue até o diretório onde você clonou o repositório do projeto e selecione a pasta raiz do projeto.
Clique em "OK" para abrir o projeto.

## Passo 3: Configurar o Dispositivo Virtual (Emulador)

Se você planeja executar o aplicativo em um emulador, siga estas etapas:

No Android Studio, clique no ícone "AVD Manager" na barra de ferramentas ou acesse "Tools" > "AVD Manager".
Clique em "Create Virtual Device" (Criar Dispositivo Virtual).
Selecione um dispositivo e uma imagem do sistema que você deseja usar para o emulador.
Siga as etapas do assistente para criar o emulador.

## Passo 4: Compilar e Executar o Projeto

No Android Studio, clique no botão "Run" (Executar) ou pressione "Shift + F10" para compilar e executar o projeto.
Selecione o dispositivo virtual que você configurou no Passo 3 ou conecte um dispositivo físico.
Aguarde o Android Studio compilar o projeto e iniciar o aplicativo.
Parabéns! Você instalou e configurou o projeto no Android Studio e está pronto para começar a desenvolver.

Lembre-se de consultar a documentação do projeto e os requisitos específicos de configuração, pois podem variar de projeto para projeto.


## Feedback
Valorizamos seu feedback. Se você encontrar algum problema, tiver sugestões ou precisar de suporte, entre em contato conosco em support@ichordsapp.com. Sua opinião é importante para nós.

## Especificações:


### SDK Versions

compileSdkVersion 33

buildToolsVersion "30.0.3"

minSdkVersion 23

targetSdkVersion 33


### Libraries

1. Retrofit- REST API Call
https://square.github.io/retrofit/
2. Glide - Image Loading and caching.
https://github.com/bumptech/glide
3. Material Design Components - Google's latest Material Components.
https://material.io/develop/android



### Built with AndroidX Support

Requires Android Studio Arctic Fox | 2020.3.1 or higher.

Current Kotlin Version 1.7.20

