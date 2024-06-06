INSERT INTO COLABORADOR (NOME, SENHA, CPF, GRUPO, EMAIL)
VALUES ('Murilo', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 70772060096, 'ADMIN', 'teste@teste.com'),
       ('Lucas', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 70126825076, 'ESTOQ', 'teste1@teste.com'),
       ('Kelvin', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 89028265031, 'ESTOQ', 'teste2@teste.com'),
       ('Pedro', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 67704309080, 'ADMIN', 'teste3@teste.com');

INSERT INTO PRODUTO (CODIGO_PRODUTO, NOME, AVALIACAO, DESCRICAO, PRECO, QTD_ESTOQUE)
VALUES (0001, 'Resident Evil 1 - Remaster', 4.0, 'Survival Horror clássico e aclamado pelos fãs da série.', 99.90, 5),
       (0002, 'Resident Evil 2 - Remake', 5.0, 'Survival Horror refeito, um dos melhores remakes já feitos.', 199.90, 20),
       (0003, 'Resident Evil 3 - Remake', 2.0, 'Survival Horror, mesma premissa do anterior, trazendo as novas mecânicas e gráficos atuais para Raccon City nas suas horas finais.', 149.90, 7),
       (0004, 'Resident Evil 4 - Remake', 5.0, 'Survival Horror, um remake de um jogo que foi eleito o melhor jogo de 2005, trazendo fielmente para nova geração essa obra prima.', 299.90, 25),
       (0005, 'Spider-Man', 4.0, 'Salve o dia como o homem-aranha, viva uma história original, a nova york da Marvel é seu parque de diversões.', 249.5, 15),
       (0006, 'Batman Arkham Knight', 4.5, 'Em Batman: Arkham Knight, o explosivo último capítulo da série Arkham, Batman enfrenta a maior ameaça já vista pela cidade que ele jurou proteger.', 179.90, 12),
       (0007, 'Days Gone', 4.5, 'Days Gone é um jogo de ação e aventura em mundo aberto que se passa em um ambiente adverso dois anos após uma pandemia mundial devastadora.', 79.90, 17),
       (0008, 'Horizon Zero Dawn', 4.5, 'Viva a aventura completa de Horizon Zero Dawn. Um dos maiores jogos de mundo aberto dessa geração.', 49.90, 22),
       (0009, 'Red Dead Redemption 2', 4.5, 'Explore um mapa vasto e atmosférico nessa na mais nova aventura da Rockstar Games, criadora de Grand Theft Auto.', 119.90, 9),
       (0010, 'God of War', 4.5, 'Com a vingança contra os deuses do Olimpo em um passado distante, Kratos agora vive como um mortal no reino dos deuses e monstros nórdicos. É nesse mundo duro e implacável ' ||
                                 'que ele deve lutar para sobreviver... e ensinar seu filho a fazer o mesmo.', 149.90, 5);

INSERT INTO USUARIO (NOME, EMAIL, CPF, NASCIMENTO, GENERO, SENHA)
VALUES ('Luciano Lopes', 'luciano.lopes@teste.com',18278889031, '03021994', 'Masculino', '123'),
       ('João da Silva', 'joao.silva@teste.com',02943504033, '25091985', 'Masculino', '123'),
       ('Maria José', 'maria.jose@teste.com',96576037066, '01072001', 'Feminino', '123'),
       ('Rebecca Costa', 'rebecca.costa@teste.com',99368214085, '22121975', 'Feminino', '123');

INSERT INTO ENDERECO (NOME, LOGRADOURO, CEP, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF, OBSERVACAO)
VALUES ('Casa', 'Rua Quinze de Novembro', 77804100, 10, 'Do lado do posto', 'Setor Central', 'Araguaína', 'TO', 'Não chegar após as 17 horas'),
       ('Tabalho', 'Rua Itacira', 60711446, 5, 'Atrás do mercado', 'Mondubim', 'Fortaleza', 'CE', 'A/C Luciano'),
       ('Casa', 'Rua Seriema', 73813794, 54, 'Casa amarela com portão de madeira', 'Parque Lago', 'Formosa', 'GO', 'Não recebemos com a embalagem violada'),
       ('Tabalho', 'Rua Joaquim Nabuco', 69915142, 67, 'Próximo ao rio', 'Conjunto Esperança', 'Rio Branco', 'AC', 'Cuidado com o Dinossauro ao lado'),
       ('Casa', 'Rua Antônio Augusto da Escóssia', 59619035, 18, 'Apartamento 77', 'Santo Antônio', 'Mossoró', 'RN', 'Deixar na portaria'),
       ('Tabalho', 'Avenida da Pitombeira', 69307775, 22, 'Casa dos fundos', 'Caçari', 'Boa Vista', 'RR', 'Deixar no número 21'),
       ('Casa', 'Rua Santa Lúcia do Jari', 60732820, 35, 'Ao lado da farmácia', 'Siqueira', 'Fortaleza', 'CE', 'Sem observação'),
       ('Tabalho', 'Rua Aparecido Romano', 16021095, 89, 'Apartamento 35 - bloco B', 'Esplanada', 'Araçatuba', 'SP', 'Sem observação');

INSERT INTO USUARIO_ENDERECO
VALUES (1,1), (2,1), (3,2), (4,2), (5,3), (6,3), (7,4), (8,4);

INSERT INTO CARTAO (NOME, NUMERO, VALIDADE, SEGURANCA)
VALUES ('LUCIANO LOPES', 4929112422213523,'2027-05-01', 951),
       ('JOÃO DA SILVA', 4556764383851590,'2029-06-12', 565),
       ('MARIA JOSÉ', 5413473991662296,'2032-09-05', 980),
       ('REBBECA COSTA', 30129284919009,'2025-01-02',  841);

INSERT INTO PEDIDO(DATA_COMPRA, ENDERECO_ENTREGA_ID, STATUS_PEDIDO, USUARIO_ID, VALOR_TOTAL)
VALUES ('2024-06-04', 2, 1, 1, 599.80);

INSERT INTO CAMINHO_IMAGEM(CAMINHO)
VALUES ('../assets/images/spiderman.jpg'),
       ('../assets/images/spiderman1.jpg'),
       ('../assets/images/spiderman2.jpg'),
       ('../assets/images/spiderman3.jpg'),
       ('../assets/images/resident-um.jpg'),
       ('../assets/images/resident-um1.jpg'),
       ('../assets/images/resident-um2.jpg'),
       ('../assets/images/resident-um3.jpg'),
       ('../assets/images/resident-tres.jpg'),
       ('../assets/images/resident-tres1.jpg'),

        ('../assets/images/resident-tres2.jpg'),
        ('../assets/images/resident-tres3.jpg'),
        ('../assets/images/resident-quatro.jpg'),
        ('../assets/images/resident-quatro1.jpg'),
        ('../assets/images/resident-quatro2.jpg'),
        ('../assets/images/resident-quatro3.jpg'),
        ('../assets/images/resident-dois.jpg'),
        ('../assets/images/resident-dois1.jpg'),
        ('../assets/images/resident-dois2.jpg'),
        ('../assets/images/resident-dois3.jpg'),

        ('../assets/images/reddead.jpg'),
        ('../assets/images/reddead1.jpg'),
        ('../assets/images/reddead2.jpg'),
        ('../assets/images/reddead3.jpg'),
        ('../assets/images/horizon.jpg'),
        ('../assets/images/horizon1.jpg'),
        ('../assets/images/horizon2.jpg'),
        ('../assets/images/horizon3.jpg'),
        ('../assets/images/godofwar.jpg'),
        ('../assets/images/godofwar1.jpg'),

        ('../assets/images/godofwar2.jpg'),
        ('../assets/images/godofwar3.jpg'),
        ('../assets/images/daysgone.jpg'),
        ('../assets/images/daysgone1.jpg'),
        ('../assets/images/daysgone2.jpg'),
        ('../assets/images/daysgone3.jpg'),
        ('../assets/images/batman.jpg'),
        ('../assets/images/batman1.jpg'),
        ('../assets/images/batman2.jpg'),
        ('../assets/images/batman3.jpg');

INSERT INTO PRODUTO_CAMINHO_IMAGEM(CAMINHO_IMAGEM_ID, PRODUTO_ID)
VALUES (1,5),(2,5),(3,5),(4,5),
       (5,1),(6,1),(7,1),(8,1),
       (9,3),(10,3),(11,3),(12,3),
       (13,4),(14,4),(15,4),(16,4),
       (17,2),(18,2),(19,2),(20,2),
       (21,9),(22,9),(23,9),(24,9),
       (25,8),(26,8),(27,8),(28,8),
       (29,10),(30,10),(31,10),(32,10),
       (33,7),(34,7),(35,7),(36,7),
       (37,6),(38,6),(39,6),(40,6);