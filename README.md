# Projeto Youtube

Simulacao de plataforma de video inspirada no YouTube - exercicio de POO em Java.

## Descricao

Projeto educacional que modela conceitos de POO (heranca, abstracao, interfaces, encapsulamento, polimorfismo) usando o dominio de uma plataforma de videos.

## Funcionalidades

- Cadastro de videos com titulo, avaliacao e visualizacoes
- Cadastro de usuarios (gafanhotos) com login
- Registro de visualizacoes (usuario assistindo video)
- Sistema de avaliacao com polimorfismo (3 formas)
- Calculo de media de avaliacoes

## Tecnologias

- **Linguagem:** Java (pura)
- **Dependencias:** Nenhuma
- **IDE:** IntelliJ IDEA

## Como Rodar

```bash
# Compile
cd src
javac *.java

# Execute
java Main
```

Ou abra no IntelliJ IDEA e execute `Main.java`.

## Estrutura

```
src/
├── Main.java           # Ponto de entrada
├── Pessoa.java         # Classe abstrata base
├── Gafanhoto.java      # Extende Pessoa (usuario)
├── AcoesVideo.java     # Interface de acoes
├── Video.java          # Implementa AcoesVideo
└── Visualizacao.java   # Relacao usuario-video
```

## Conceitos Demonstrados

- Classes abstratas (Pessoa)
- Interfaces (AcoesVideo)
- Heranca (Gafanhoto extends Pessoa)
- Polimorfismo (metodo avaliar sobrecarregado)
- Encapsulamento (getters/setters)
- Composicao (Visualizacao associa Gafanhoto e Video)

## Licenca

MIT License - Diego Vieira
