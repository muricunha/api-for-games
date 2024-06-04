INSERT INTO COLABORADOR (NOME, SENHA, CPF, GRUPO, EMAIL)
VALUES ('Murilo', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 70772060096, 'ADMIN', 'teste@teste.com'),
       ('Lucas', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 70126825076, 'ESTOQ', 'teste1@teste.com'),
       ('Kelvin', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 89028265031, 'ESTOQ', 'teste2@teste.com'),
       ('Pedro', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 67704309080, 'ADMIN', 'teste3@teste.com');

INSERT INTO PRODUTO (CODIGO_PRODUTO, NOME, AVALIACAO, DESCRICAO, PRECO, QTD_ESTOQUE, CAMINHO_IMAGEM)
VALUES (0001, 'Resident Evil 1 - Remaster', 4.0, 'Survival Horror clássico e aclamado pelos fãs da série.', 99.90, 5, '../assets/images/resident1.jpg'),
       (0002, 'Resident Evil 2 - Remake', 5.0, 'Survival Horror refeito, um dos melhores remakes já feitos.', 199.90, 20, '../assets/images/resident2.jpg'),
       (0003, 'Resident Evil 3 - Remake', 2.0, 'Survival Horror, mesma premissa do anterior, trazendo as novas mecânicas e gráficos atuais para Raccon City nas suas horas finais.', 149.90, 7, '../assets/images/resident3.jpg'),
       (0004, 'Resident Evil 4 - Remake', 5.0, 'Survival Horror, um remake de um jogo que foi eleito o melhor jogo de 2005, trazendo fielmente para nova geração essa obra prima.', 299.90, 25, '../assets/images/resident4.jpg'),
       (0005, 'Spider-Man', 4.0, 'Salve o dia como o homem-aranha, viva uma história original, a nova york da Marvel é seu parque de diversões.', 249.5, 15, '../assets/images/spiderman.jpg'),
       (0006, 'Batman Arkham Knight', 4.5, 'Em Batman: Arkham Knight, o explosivo último capítulo da série Arkham, Batman enfrenta a maior ameaça já vista pela cidade que ele jurou proteger.', 179.90, 12, '../assets/images/batman.jpg'),
       (0007, 'Days Gone', 4.5, 'Days Gone é um jogo de ação e aventura em mundo aberto que se passa em um ambiente adverso dois anos após uma pandemia mundial devastadora.', 79.90, 17, '../assets/images/daysgone.jpg'),
       (0008, 'Horizon Zero Dawn', 4.5, 'Viva a aventura completa de Horizon Zero Dawn. Um dos maiores jogos de mundo aberto dessa geração.', 49.90, 22, '../assets/images/horizon.jpg'),
       (0009, 'Red Dead Redemption 2', 4.5, 'Explore um mapa vasto e atmosférico nessa na mais nova aventura da Rockstar Games, criadora de Grand Theft Auto.', 119.90, 9, '../assets/images/reddead.jpg'),
       (0010, 'God of War', 4.5, 'Com a vingança contra os deuses do Olimpo em um passado distante, Kratos agora vive como um mortal no reino dos deuses e monstros nórdicos. É nesse mundo duro e implacável que ele deve lutar para sobreviver... e ensinar seu filho a fazer o mesmo.', 149.90, 5, '../assets/images/godofwar.jpg');

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
/*
INSERT INTO FORMA_PAGAMENTO_CARTAO_LIST (CARTAO_LIST_ID)
VALUES (1);
*/


INSERT INTO PEDIDO(DATA_COMPRA, ENDERECO_ENTREGA_ID, STATUS_PEDIDO, USUARIO_ID, VALOR_TOTAL)
VALUES ('2024-06-04', 2, 1, 1, 599.80);