PGDMP     #                     z           eCommerceSyte    14.1    14.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    57530    eCommerceSyte    DATABASE     k   CREATE DATABASE "eCommerceSyte" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Italian_Italy.1252';
    DROP DATABASE "eCommerceSyte";
                postgres    false            ?            1259    57545    carrello    TABLE     ?   CREATE TABLE public.carrello (
    cod_carrello integer NOT NULL,
    cod_utente integer NOT NULL,
    cod_prodotto integer NOT NULL,
    quantita numeric NOT NULL
);
    DROP TABLE public.carrello;
       public         heap    postgres    false            ?            1259    57597    carrello_cod_carrello_seq    SEQUENCE     ?   ALTER TABLE public.carrello ALTER COLUMN cod_carrello ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.carrello_cod_carrello_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    211            ?            1259    57538    prodotto    TABLE     ?   CREATE TABLE public.prodotto (
    cod_prodotto integer NOT NULL,
    nome character varying NOT NULL,
    descrizione character varying,
    prezzo numeric NOT NULL
);
    DROP TABLE public.prodotto;
       public         heap    postgres    false            ?            1259    57588    prodotto_cod_prodotto_seq    SEQUENCE     ?   ALTER TABLE public.prodotto ALTER COLUMN cod_prodotto ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.prodotto_cod_prodotto_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    210            ?            1259    57531    utente    TABLE     ?   CREATE TABLE public.utente (
    cod_utente integer NOT NULL,
    username character varying NOT NULL,
    email character varying NOT NULL,
    password character varying NOT NULL,
    admin boolean
);
    DROP TABLE public.utente;
       public         heap    postgres    false            ?            1259    57579    utente_cod_utente_seq    SEQUENCE     ?   ALTER TABLE public.utente ALTER COLUMN cod_utente ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.utente_cod_utente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    209            ?          0    57545    carrello 
   TABLE DATA                 public          postgres    false    211   ~       ?          0    57538    prodotto 
   TABLE DATA                 public          postgres    false    210          ?          0    57531    utente 
   TABLE DATA                 public          postgres    false    209   ?                  0    0    carrello_cod_carrello_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.carrello_cod_carrello_seq', 28, true);
          public          postgres    false    214                       0    0    prodotto_cod_prodotto_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.prodotto_cod_prodotto_seq', 6, true);
          public          postgres    false    213                       0    0    utente_cod_utente_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.utente_cod_utente_seq', 5, true);
          public          postgres    false    212            k           2606    57590    carrello carrello_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.carrello
    ADD CONSTRAINT carrello_pkey PRIMARY KEY (cod_carrello);
 @   ALTER TABLE ONLY public.carrello DROP CONSTRAINT carrello_pkey;
       public            postgres    false    211            i           2606    57581    prodotto prodotto_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.prodotto
    ADD CONSTRAINT prodotto_pkey PRIMARY KEY (cod_prodotto);
 @   ALTER TABLE ONLY public.prodotto DROP CONSTRAINT prodotto_pkey;
       public            postgres    false    210            g           2606    57572    utente utente_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.utente
    ADD CONSTRAINT utente_pkey PRIMARY KEY (cod_utente);
 <   ALTER TABLE ONLY public.utente DROP CONSTRAINT utente_pkey;
       public            postgres    false    209            m           2606    57615    carrello cod_prodotto    FK CONSTRAINT     ?   ALTER TABLE ONLY public.carrello
    ADD CONSTRAINT cod_prodotto FOREIGN KEY (cod_prodotto) REFERENCES public.prodotto(cod_prodotto) NOT VALID;
 ?   ALTER TABLE ONLY public.carrello DROP CONSTRAINT cod_prodotto;
       public          postgres    false    211    210    3177            l           2606    57610    carrello cod_utente    FK CONSTRAINT     ?   ALTER TABLE ONLY public.carrello
    ADD CONSTRAINT cod_utente FOREIGN KEY (cod_utente) REFERENCES public.utente(cod_utente) NOT VALID;
 =   ALTER TABLE ONLY public.carrello DROP CONSTRAINT cod_utente;
       public          postgres    false    211    3175    209            ?   ?   x???v
Q???W((M??L?KN,*J???W?H?O???t@?ҒԼ?T??(?%??(SX??W?Y?????????????????
!?4??t?tLuL4??<?l?9?rC??\\ ??O       ?   ?   x?Œ?
?0E????U????q?X$??*???3!??z???P????2,/???W'Я?D>цr?`ĩ???=E???`??????:???۱|嵬?#\6?s??%???{???>=??2?t??? ??=??7??,?t0??s-???P؊?????c?ȑK?\/1?"<?z?<???76dm?????Z?t      ?   ?   x????
?0?{???i ?sՍA?RP????b?????75?^?????1???0	?h?FpӬ???V?V?ë?<dt#j??I?DY?pæyTu???T3?? ?閆;HNI ????p'?x.?Jr^?Xߵ=6?W???JxUv?|aF[k1[[?[??H?l?K'??"?f\?h?*\t?{??d?????4+??1f?7?L??cYO????     