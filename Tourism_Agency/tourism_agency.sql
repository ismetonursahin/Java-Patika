PGDMP     !    4                |            turism_agency    13.13    13.13 "    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16835    turism_agency    DATABASE     k   CREATE DATABASE turism_agency WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_T�rkiye.1254';
    DROP DATABASE turism_agency;
                postgres    false            �            1259    24969    hotels    TABLE     �  CREATE TABLE public.hotels (
    id bigint NOT NULL,
    name text NOT NULL,
    city text NOT NULL,
    region text NOT NULL,
    adress text NOT NULL,
    mail text NOT NULL,
    phone text NOT NULL,
    star integer NOT NULL,
    park boolean NOT NULL,
    wifi boolean NOT NULL,
    pool boolean NOT NULL,
    fitness boolean NOT NULL,
    concierge boolean NOT NULL,
    spa boolean NOT NULL,
    room_service boolean NOT NULL
);
    DROP TABLE public.hotels;
       public         heap    postgres    false            �            1259    24967    hotels_id_seq    SEQUENCE     �   ALTER TABLE public.hotels ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.hotels_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    203            �            1259    24979    pension_types    TABLE     w   CREATE TABLE public.pension_types (
    id bigint NOT NULL,
    hotel_id bigint NOT NULL,
    type integer NOT NULL
);
 !   DROP TABLE public.pension_types;
       public         heap    postgres    false            �            1259    24977    pension_types_id_seq    SEQUENCE     �   ALTER TABLE public.pension_types ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.pension_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    205            �            1259    33168    rezervation    TABLE     �  CREATE TABLE public.rezervation (
    id bigint NOT NULL,
    room_id integer NOT NULL,
    total_price integer NOT NULL,
    check_in date NOT NULL,
    check_out date NOT NULL,
    guest_num integer NOT NULL,
    guest_name text NOT NULL,
    guest_tc text NOT NULL,
    guest_mail text NOT NULL,
    guest_phone text NOT NULL,
    day integer NOT NULL,
    adult_num integer NOT NULL,
    child_num integer NOT NULL
);
    DROP TABLE public.rezervation;
       public         heap    postgres    false            �            1259    33176    rezervation_id_seq    SEQUENCE     �   ALTER TABLE public.rezervation ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.rezervation_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    210            �            1259    24993    rooms    TABLE     �  CREATE TABLE public.rooms (
    id bigint NOT NULL,
    pension_type_id bigint NOT NULL,
    room_type integer NOT NULL,
    stock integer NOT NULL,
    adult_price integer NOT NULL,
    child_price integer NOT NULL,
    meter integer NOT NULL,
    tv boolean NOT NULL,
    minibar boolean NOT NULL,
    consol boolean NOT NULL,
    safe boolean NOT NULL,
    condition boolean NOT NULL,
    season_id bigint NOT NULL,
    hotel_id bigint NOT NULL,
    bed integer NOT NULL
);
    DROP TABLE public.rooms;
       public         heap    postgres    false            �            1259    24991    rooms_id_seq    SEQUENCE     �   ALTER TABLE public.rooms ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.rooms_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    209            �            1259    24986    seasons    TABLE     �   CREATE TABLE public.seasons (
    id bigint NOT NULL,
    hotel_id integer NOT NULL,
    start_date date NOT NULL,
    finish_date date NOT NULL
);
    DROP TABLE public.seasons;
       public         heap    postgres    false            �            1259    24984    seasons_id_seq    SEQUENCE     �   ALTER TABLE public.seasons ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.seasons_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    207            �            1259    16836    users    TABLE     �   CREATE TABLE public.users (
    user_id integer NOT NULL,
    name text NOT NULL,
    username text NOT NULL,
    password text NOT NULL,
    user_role text NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false            �            1259    16839    users_user_id_seq    SEQUENCE     �   ALTER TABLE public.users ALTER COLUMN user_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.users_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    200            �          0    24969    hotels 
   TABLE DATA           �   COPY public.hotels (id, name, city, region, adress, mail, phone, star, park, wifi, pool, fitness, concierge, spa, room_service) FROM stdin;
    public          postgres    false    203   1(       �          0    24979    pension_types 
   TABLE DATA           ;   COPY public.pension_types (id, hotel_id, type) FROM stdin;
    public          postgres    false    205   �(       �          0    33168    rezervation 
   TABLE DATA           �   COPY public.rezervation (id, room_id, total_price, check_in, check_out, guest_num, guest_name, guest_tc, guest_mail, guest_phone, day, adult_num, child_num) FROM stdin;
    public          postgres    false    210   M)       �          0    24993    rooms 
   TABLE DATA           �   COPY public.rooms (id, pension_type_id, room_type, stock, adult_price, child_price, meter, tv, minibar, consol, safe, condition, season_id, hotel_id, bed) FROM stdin;
    public          postgres    false    209   �)       �          0    24986    seasons 
   TABLE DATA           H   COPY public.seasons (id, hotel_id, start_date, finish_date) FROM stdin;
    public          postgres    false    207   �*       �          0    16836    users 
   TABLE DATA           M   COPY public.users (user_id, name, username, password, user_role) FROM stdin;
    public          postgres    false    200   �*       �           0    0    hotels_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.hotels_id_seq', 3, true);
          public          postgres    false    202            �           0    0    pension_types_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.pension_types_id_seq', 19, true);
          public          postgres    false    204            �           0    0    rezervation_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.rezervation_id_seq', 15, true);
          public          postgres    false    211            �           0    0    rooms_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.rooms_id_seq', 12, true);
          public          postgres    false    208            �           0    0    seasons_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.seasons_id_seq', 6, true);
          public          postgres    false    206            �           0    0    users_user_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.users_user_id_seq', 8, true);
          public          postgres    false    201            G           2606    24976    hotels hotels_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.hotels
    ADD CONSTRAINT hotels_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.hotels DROP CONSTRAINT hotels_pkey;
       public            postgres    false    203            I           2606    24983     pension_types pension_types_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.pension_types
    ADD CONSTRAINT pension_types_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.pension_types DROP CONSTRAINT pension_types_pkey;
       public            postgres    false    205            O           2606    33175    rezervation rezervation_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.rezervation
    ADD CONSTRAINT rezervation_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.rezervation DROP CONSTRAINT rezervation_pkey;
       public            postgres    false    210            M           2606    25000    rooms rooms_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.rooms
    ADD CONSTRAINT rooms_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.rooms DROP CONSTRAINT rooms_pkey;
       public            postgres    false    209            K           2606    24990    seasons seasons_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.seasons
    ADD CONSTRAINT seasons_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.seasons DROP CONSTRAINT seasons_pkey;
       public            postgres    false    207            E           2606    16848    users users_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (user_id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    200            �   �   x�]�M�0���S���Zԕ�b���(%4����q�
�%A�L�,�K�y�H�!��d�?j���d0���e��n0|�-�S���C�t�)]�h3q-s�T����^� �Rl��SXQk��۲�g
�{L���X���ҁT@2�I	�!*�����u�Ca\�����f�TZy�~j�Tv��'c�W,      �   >   x����0��e���B�q0��t��r�J�	)N��Ӱ�	\n6��lJ8�������
a      �   �   x���;
�@�z�{���-�-�@�E�f-��g�;$�2)���i�a��D!��6��2A1=�ܕxn�8?ҩ�����J7�]N��>^2��,#����t�^%2���X����;q��mBx.+d      �   �   x�U�AC!D�p�6���.]{��?�44��O�ef��R##5҆ь>�3\�IF�咣B�0xa6RIjc,	���P;nŷ G�%r2My��k�r�y��s��mJ�ԣ�D�R�;i�A,X
������TBa�vI����h���w�t2���Of�4"=y      �   9   x�3�4�4202�50"(�T�ؐ�.c�14ɘp��c
�A�c�i�CO� ��o      �   G   x�3�<��87�D�?��H��Č�<�L������)gbJnf�'�|Lg>�U��[��_������� {Z     