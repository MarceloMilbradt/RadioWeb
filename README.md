# RadioWeb
RadioWeb - trabalho de LP3

Esta aplicação é um cliente/servidor de streaming de musica, utilizando o protocolo UDP e sockets

A aplicação é dividida em 3 partes

# Servidor
Este recebe os arquivos de musica do controlador, por TCP, e distribui elas para os ouvintes, podem haver N ouvintes e N controladores, este quebra o arquivo em chuncks e gera um protocolo que o client entende, mantendo controle dos ticks das musicas, e qual foi o ultimo pacote enviado, tudo isso em paralelo, transmitindo para N clientes.

# Controlador
Este possuiu acesso ao um banco de dados onde estão salvas as musicas e playlists, ele tem a função de comunicar com o servidor e decidir o que irá tocar.

# Ouvintes(clients)
Os ouvintes apenas recebem as musicas do servidor, eles podem escolher de qual controlador querem receber, podem pausar a musica e alterar o volume.
