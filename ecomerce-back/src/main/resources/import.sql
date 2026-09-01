insert into categoria (nome, descricao) values ("Informatica","Produtos da area de informatica");
insert into categoria (nome, descricao) values("Macaco","Comida de macaco");
insert into categoria (nome, descricao) values ("Video-Game", "Jogos, consoles e Acessorios");
insert into categoria (nome, descricao) values ("Alimentos", "Coisas de comer");
INSERT into categoria (nome,descricao) values ("Bebidas", "Liquidos Bebiveis");

insert into produto (nome, descricao, preco, estoque, categoria_id) values ("Mouse","Razer Basilisk", 2.50, 1, 1);
insert into produto (nome,descricao, preco, estoque, categoria_id) values ("Banana", "Fruta amarela", 5.00, 3, 2);
insert into produto (nome,descricao, preco, estoque, categoria_id) values ("OuterWilds","Jogo de espaço",20.0, 10,3);
insert into produto (nome,descricao, preco, estoque, categoria_id) values ("Pipoca","Milho Estourado",7.50,100,4);
insert into produto (nome,descricao, preco, estoque, categoria_id) values ("RedBull", "Liquido Energetico",10.0,20,5);

insert into cliente (nome,email,telefone) values ("Mauricio","email1@gmail","(14)991220557");
INSERT INTO cliente (nome, email, telefone) VALUES ("Ana", "ana@gmail.com", "(14)991234567");
INSERT INTO cliente (nome, email, telefone) VALUES ("Carlos", "carlos@gmail.com", "(14)992345678");
INSERT INTO cliente (nome, email, telefone) VALUES ("Juliana", "juliana@gmail.com", "(14)993456789");
INSERT INTO cliente (nome, email, telefone) VALUES ("Rafael", "rafael@gmail.com", "(14)994567890");

insert into pedido (data, status, valor_total,cliente_id) values ('2026-09-01', "Pago",100,1);
INSERT INTO pedido (data, status, valor_total, cliente_id) VALUES('2026-09-02', "Pago", 150, 2);
INSERT INTO pedido (data, status, valor_total, cliente_id) VALUES('2026-09-03', "Pendente", 80, 3);
INSERT INTO pedido (data, status, valor_total, cliente_id) VALUES('2026-09-04', "Pago", 220, 4);
INSERT INTO pedido (data, status, valor_total, cliente_id) VALUES('2026-09-05', "Cancelado", 50, 5);
INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (2, 50.0, 1, 1);
INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (3, 75.0, 2, 2);
INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (1, 100.0, 3, 3);
INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (4, 25.0, 4, 4);
INSERT INTO item_pedido (quantidade, valor_unitario, pedido_id, produto_id) VALUES (2, 120.0, 5, 5);
INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (100.0, '2026-09-01', "Pago", "Pix", 1);
INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (150.0, '2026-09-02', "Pago", "Cartao", 2);
INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (80.0, '2026-09-03', "Pendente", "Boleto", 3);
INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (220.0, '2026-09-04', "Pago", "Pix", 4);
INSERT INTO pagamento (valor, data, status, tipo, pedido_id) VALUES (50.0, '2026-09-05', "Cancelado", "Cartao", 5);