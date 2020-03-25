package android.bigranch.scryfallsearchapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Card implements Parcelable {

    private String object;
    private String id;
    private String oracle_id;
    private int tcgplayer_id;
    private String name;
    private String lang;
    private String released_at;
    private String uri;
    private String scryfall_uri;
    private String layout;
    private boolean highres_image;
    private ImageUrisBean image_uris;
    private String mana_cost;
    private int cmc;
    private String type_line;
    private String oracle_text;
    private String power;
    private String toughness;
    private LegalitiesBean legalities;
    private boolean reserved;
    private boolean foil;
    private boolean nonfoil;
    private boolean oversized;
    private boolean promo;
    private boolean reprint;
    private boolean variation;
    private String set;
    private String set_name;
    private String set_type;
    private String set_uri;
    private String set_search_uri;
    private String scryfall_set_uri;
    private String rulings_uri;
    private String prints_search_uri;
    private String collector_number;
    private boolean digital;
    private String rarity;
    private String card_back_id;
    private String artist;
    private String illustration_id;
    private String border_color;
    private String frame;
    private boolean full_art;
    private boolean textless;
    private boolean booster;
    private boolean story_spotlight;
    private int edhrec_rank;
    private PricesBean prices;
    private RelatedUrisBean related_uris;
    private PurchaseUrisBean purchase_uris;
    private List<Integer> multiverse_ids;
    private List<String> colors;
    private List<String> color_identity;
    private List<String> games;
    private List<String> artist_ids;

    protected Card(Parcel in) {
        object = in.readString();
        id = in.readString();
        oracle_id = in.readString();
        tcgplayer_id = in.readInt();
        name = in.readString();
        lang = in.readString();
        released_at = in.readString();
        uri = in.readString();
        scryfall_uri = in.readString();
        layout = in.readString();
        highres_image = in.readByte() != 0;
        image_uris = in.readParcelable(ImageUrisBean.class.getClassLoader());
        mana_cost = in.readString();
        cmc = in.readInt();
        type_line = in.readString();
        oracle_text = in.readString();
        power = in.readString();
        toughness = in.readString();
        legalities = in.readParcelable(LegalitiesBean.class.getClassLoader());
        reserved = in.readByte() != 0;
        foil = in.readByte() != 0;
        nonfoil = in.readByte() != 0;
        oversized = in.readByte() != 0;
        promo = in.readByte() != 0;
        reprint = in.readByte() != 0;
        variation = in.readByte() != 0;
        set = in.readString();
        set_name = in.readString();
        set_type = in.readString();
        set_uri = in.readString();
        set_search_uri = in.readString();
        scryfall_set_uri = in.readString();
        rulings_uri = in.readString();
        prints_search_uri = in.readString();
        collector_number = in.readString();
        digital = in.readByte() != 0;
        rarity = in.readString();
        card_back_id = in.readString();
        artist = in.readString();
        illustration_id = in.readString();
        border_color = in.readString();
        frame = in.readString();
        full_art = in.readByte() != 0;
        textless = in.readByte() != 0;
        booster = in.readByte() != 0;
        story_spotlight = in.readByte() != 0;
        edhrec_rank = in.readInt();
        prices = in.readParcelable(PricesBean.class.getClassLoader());
        related_uris = in.readParcelable(RelatedUrisBean.class.getClassLoader());
        purchase_uris = in.readParcelable(PurchaseUrisBean.class.getClassLoader());
        colors = in.createStringArrayList();
        color_identity = in.createStringArrayList();
        games = in.createStringArrayList();
        artist_ids = in.createStringArrayList();
    }

    public static final Creator<Card> CREATOR = new Creator<Card>() {
        @Override
        public Card createFromParcel(Parcel in) {
            return new Card(in);
        }

        @Override
        public Card[] newArray(int size) {
            return new Card[size];
        }
    };

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOracle_id() {
        return oracle_id;
    }

    public void setOracle_id(String oracle_id) {
        this.oracle_id = oracle_id;
    }

    public int getTcgplayer_id() {
        return tcgplayer_id;
    }

    public void setTcgplayer_id(int tcgplayer_id) {
        this.tcgplayer_id = tcgplayer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getReleased_at() {
        return released_at;
    }

    public void setReleased_at(String released_at) {
        this.released_at = released_at;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getScryfall_uri() {
        return scryfall_uri;
    }

    public void setScryfall_uri(String scryfall_uri) {
        this.scryfall_uri = scryfall_uri;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public boolean isHighres_image() {
        return highres_image;
    }

    public void setHighres_image(boolean highres_image) {
        this.highres_image = highres_image;
    }

    public ImageUrisBean getImage_uris() {
        return image_uris;
    }

    public void setImage_uris(ImageUrisBean image_uris) {
        this.image_uris = image_uris;
    }

    public String getMana_cost() {
        return mana_cost;
    }

    public void setMana_cost(String mana_cost) {
        this.mana_cost = mana_cost;
    }

    public int getCmc() {
        return cmc;
    }

    public void setCmc(int cmc) {
        this.cmc = cmc;
    }

    public String getType_line() {
        return type_line;
    }

    public void setType_line(String type_line) {
        this.type_line = type_line;
    }

    public String getOracle_text() {
        return oracle_text;
    }

    public void setOracle_text(String oracle_text) {
        this.oracle_text = oracle_text;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public LegalitiesBean getLegalities() {
        return legalities;
    }

    public void setLegalities(LegalitiesBean legalities) {
        this.legalities = legalities;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isFoil() {
        return foil;
    }

    public void setFoil(boolean foil) {
        this.foil = foil;
    }

    public boolean isNonfoil() {
        return nonfoil;
    }

    public void setNonfoil(boolean nonfoil) {
        this.nonfoil = nonfoil;
    }

    public boolean isOversized() {
        return oversized;
    }

    public void setOversized(boolean oversized) {
        this.oversized = oversized;
    }

    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public boolean isReprint() {
        return reprint;
    }

    public void setReprint(boolean reprint) {
        this.reprint = reprint;
    }

    public boolean isVariation() {
        return variation;
    }

    public void setVariation(boolean variation) {
        this.variation = variation;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getSet_name() {
        return set_name;
    }

    public void setSet_name(String set_name) {
        this.set_name = set_name;
    }

    public String getSet_type() {
        return set_type;
    }

    public void setSet_type(String set_type) {
        this.set_type = set_type;
    }

    public String getSet_uri() {
        return set_uri;
    }

    public void setSet_uri(String set_uri) {
        this.set_uri = set_uri;
    }

    public String getSet_search_uri() {
        return set_search_uri;
    }

    public void setSet_search_uri(String set_search_uri) {
        this.set_search_uri = set_search_uri;
    }

    public String getScryfall_set_uri() {
        return scryfall_set_uri;
    }

    public void setScryfall_set_uri(String scryfall_set_uri) {
        this.scryfall_set_uri = scryfall_set_uri;
    }

    public String getRulings_uri() {
        return rulings_uri;
    }

    public void setRulings_uri(String rulings_uri) {
        this.rulings_uri = rulings_uri;
    }

    public String getPrints_search_uri() {
        return prints_search_uri;
    }

    public void setPrints_search_uri(String prints_search_uri) {
        this.prints_search_uri = prints_search_uri;
    }

    public String getCollector_number() {
        return collector_number;
    }

    public void setCollector_number(String collector_number) {
        this.collector_number = collector_number;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getCard_back_id() {
        return card_back_id;
    }

    public void setCard_back_id(String card_back_id) {
        this.card_back_id = card_back_id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getIllustration_id() {
        return illustration_id;
    }

    public void setIllustration_id(String illustration_id) {
        this.illustration_id = illustration_id;
    }

    public String getBorder_color() {
        return border_color;
    }

    public void setBorder_color(String border_color) {
        this.border_color = border_color;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public boolean isFull_art() {
        return full_art;
    }

    public void setFull_art(boolean full_art) {
        this.full_art = full_art;
    }

    public boolean isTextless() {
        return textless;
    }

    public void setTextless(boolean textless) {
        this.textless = textless;
    }

    public boolean isBooster() {
        return booster;
    }

    public void setBooster(boolean booster) {
        this.booster = booster;
    }

    public boolean isStory_spotlight() {
        return story_spotlight;
    }

    public void setStory_spotlight(boolean story_spotlight) {
        this.story_spotlight = story_spotlight;
    }

    public int getEdhrec_rank() {
        return edhrec_rank;
    }

    public void setEdhrec_rank(int edhrec_rank) {
        this.edhrec_rank = edhrec_rank;
    }

    public PricesBean getPrices() {
        return prices;
    }

    public void setPrices(PricesBean prices) {
        this.prices = prices;
    }

    public RelatedUrisBean getRelated_uris() {
        return related_uris;
    }

    public void setRelated_uris(RelatedUrisBean related_uris) {
        this.related_uris = related_uris;
    }

    public PurchaseUrisBean getPurchase_uris() {
        return purchase_uris;
    }

    public void setPurchase_uris(PurchaseUrisBean purchase_uris) {
        this.purchase_uris = purchase_uris;
    }

    public List<Integer> getMultiverse_ids() {
        return multiverse_ids;
    }

    public void setMultiverse_ids(List<Integer> multiverse_ids) {
        this.multiverse_ids = multiverse_ids;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public List<String> getColor_identity() {
        return color_identity;
    }

    public void setColor_identity(List<String> color_identity) {
        this.color_identity = color_identity;
    }

    public List<String> getGames() {
        return games;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    public List<String> getArtist_ids() {
        return artist_ids;
    }

    public void setArtist_ids(List<String> artist_ids) {
        this.artist_ids = artist_ids;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(object);
        dest.writeString(id);
        dest.writeString(oracle_id);
        dest.writeInt(tcgplayer_id);
        dest.writeString(name);
        dest.writeString(lang);
        dest.writeString(released_at);
        dest.writeString(uri);
        dest.writeString(scryfall_uri);
        dest.writeString(layout);
        dest.writeByte((byte) (highres_image ? 1 : 0));
        dest.writeParcelable(image_uris, flags);
        dest.writeString(mana_cost);
        dest.writeInt(cmc);
        dest.writeString(type_line);
        dest.writeString(oracle_text);
        dest.writeString(power);
        dest.writeString(toughness);
        dest.writeParcelable(legalities, flags);
        dest.writeByte((byte) (reserved ? 1 : 0));
        dest.writeByte((byte) (foil ? 1 : 0));
        dest.writeByte((byte) (nonfoil ? 1 : 0));
        dest.writeByte((byte) (oversized ? 1 : 0));
        dest.writeByte((byte) (promo ? 1 : 0));
        dest.writeByte((byte) (reprint ? 1 : 0));
        dest.writeByte((byte) (variation ? 1 : 0));
        dest.writeString(set);
        dest.writeString(set_name);
        dest.writeString(set_type);
        dest.writeString(set_uri);
        dest.writeString(set_search_uri);
        dest.writeString(scryfall_set_uri);
        dest.writeString(rulings_uri);
        dest.writeString(prints_search_uri);
        dest.writeString(collector_number);
        dest.writeByte((byte) (digital ? 1 : 0));
        dest.writeString(rarity);
        dest.writeString(card_back_id);
        dest.writeString(artist);
        dest.writeString(illustration_id);
        dest.writeString(border_color);
        dest.writeString(frame);
        dest.writeByte((byte) (full_art ? 1 : 0));
        dest.writeByte((byte) (textless ? 1 : 0));
        dest.writeByte((byte) (booster ? 1 : 0));
        dest.writeByte((byte) (story_spotlight ? 1 : 0));
        dest.writeInt(edhrec_rank);
        dest.writeParcelable(prices, flags);
        dest.writeParcelable(related_uris, flags);
        dest.writeParcelable(purchase_uris, flags);
        dest.writeStringList(colors);
        dest.writeStringList(color_identity);
        dest.writeStringList(games);
        dest.writeStringList(artist_ids);
    }

    public static class ImageUrisBean implements Parcelable {
        /**
         * small : https://img.scryfall.com/cards/small/front/0/2/023b5e6f-10de-422d-8431-11f1fdeca246.jpg?1562895407
         * normal : https://img.scryfall.com/cards/normal/front/0/2/023b5e6f-10de-422d-8431-11f1fdeca246.jpg?1562895407
         * large : https://img.scryfall.com/cards/large/front/0/2/023b5e6f-10de-422d-8431-11f1fdeca246.jpg?1562895407
         * png : https://img.scryfall.com/cards/png/front/0/2/023b5e6f-10de-422d-8431-11f1fdeca246.png?1562895407
         * art_crop : https://img.scryfall.com/cards/art_crop/front/0/2/023b5e6f-10de-422d-8431-11f1fdeca246.jpg?1562895407
         * border_crop : https://img.scryfall.com/cards/border_crop/front/0/2/023b5e6f-10de-422d-8431-11f1fdeca246.jpg?1562895407
         */

        private String small;
        private String normal;
        private String large;
        private String png;
        private String art_crop;
        private String border_crop;

        protected ImageUrisBean(Parcel in) {
            small = in.readString();
            normal = in.readString();
            large = in.readString();
            png = in.readString();
            art_crop = in.readString();
            border_crop = in.readString();
        }

        public static final Creator<ImageUrisBean> CREATOR = new Creator<ImageUrisBean>() {
            @Override
            public ImageUrisBean createFromParcel(Parcel in) {
                return new ImageUrisBean(in);
            }

            @Override
            public ImageUrisBean[] newArray(int size) {
                return new ImageUrisBean[size];
            }
        };

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getNormal() {
            return normal;
        }

        public void setNormal(String normal) {
            this.normal = normal;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getPng() {
            return png;
        }

        public void setPng(String png) {
            this.png = png;
        }

        public String getArt_crop() {
            return art_crop;
        }

        public void setArt_crop(String art_crop) {
            this.art_crop = art_crop;
        }

        public String getBorder_crop() {
            return border_crop;
        }

        public void setBorder_crop(String border_crop) {
            this.border_crop = border_crop;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(small);
            dest.writeString(normal);
            dest.writeString(large);
            dest.writeString(png);
            dest.writeString(art_crop);
            dest.writeString(border_crop);
        }
    }

    public static class LegalitiesBean implements Parcelable {
        /**
         * standard : not_legal
         * future : not_legal
         * historic : not_legal
         * pioneer : not_legal
         * modern : not_legal
         * legacy : legal
         * pauper : not_legal
         * vintage : legal
         * penny : not_legal
         * commander : legal
         * brawl : not_legal
         * duel : legal
         * oldschool : legal
         */

        private String standard;
        private String future;
        private String historic;
        private String pioneer;
        private String modern;
        private String legacy;
        private String pauper;
        private String vintage;
        private String penny;
        private String commander;
        private String brawl;
        private String duel;
        private String oldschool;

        protected LegalitiesBean(Parcel in) {
            standard = in.readString();
            future = in.readString();
            historic = in.readString();
            pioneer = in.readString();
            modern = in.readString();
            legacy = in.readString();
            pauper = in.readString();
            vintage = in.readString();
            penny = in.readString();
            commander = in.readString();
            brawl = in.readString();
            duel = in.readString();
            oldschool = in.readString();
        }

        public static final Creator<LegalitiesBean> CREATOR = new Creator<LegalitiesBean>() {
            @Override
            public LegalitiesBean createFromParcel(Parcel in) {
                return new LegalitiesBean(in);
            }

            @Override
            public LegalitiesBean[] newArray(int size) {
                return new LegalitiesBean[size];
            }
        };

        public String getStandard() {
            return standard;
        }

        public void setStandard(String standard) {
            this.standard = standard;
        }

        public String getFuture() {
            return future;
        }

        public void setFuture(String future) {
            this.future = future;
        }

        public String getHistoric() {
            return historic;
        }

        public void setHistoric(String historic) {
            this.historic = historic;
        }

        public String getPioneer() {
            return pioneer;
        }

        public void setPioneer(String pioneer) {
            this.pioneer = pioneer;
        }

        public String getModern() {
            return modern;
        }

        public void setModern(String modern) {
            this.modern = modern;
        }

        public String getLegacy() {
            return legacy;
        }

        public void setLegacy(String legacy) {
            this.legacy = legacy;
        }

        public String getPauper() {
            return pauper;
        }

        public void setPauper(String pauper) {
            this.pauper = pauper;
        }

        public String getVintage() {
            return vintage;
        }

        public void setVintage(String vintage) {
            this.vintage = vintage;
        }

        public String getPenny() {
            return penny;
        }

        public void setPenny(String penny) {
            this.penny = penny;
        }

        public String getCommander() {
            return commander;
        }

        public void setCommander(String commander) {
            this.commander = commander;
        }

        public String getBrawl() {
            return brawl;
        }

        public void setBrawl(String brawl) {
            this.brawl = brawl;
        }

        public String getDuel() {
            return duel;
        }

        public void setDuel(String duel) {
            this.duel = duel;
        }

        public String getOldschool() {
            return oldschool;
        }

        public void setOldschool(String oldschool) {
            this.oldschool = oldschool;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(standard);
            dest.writeString(future);
            dest.writeString(historic);
            dest.writeString(pioneer);
            dest.writeString(modern);
            dest.writeString(legacy);
            dest.writeString(pauper);
            dest.writeString(vintage);
            dest.writeString(penny);
            dest.writeString(commander);
            dest.writeString(brawl);
            dest.writeString(duel);
            dest.writeString(oldschool);
        }
    }

    public static class PricesBean implements Parcelable {
        /**
         * usd : 0.23
         * usd_foil : null
         * eur : 0.10
         * tix : null
         */

        private String usd;
        private Object usd_foil;
        private String eur;
        private Object tix;

        protected PricesBean(Parcel in) {
            usd = in.readString();
            eur = in.readString();
        }

        public static final Creator<PricesBean> CREATOR = new Creator<PricesBean>() {
            @Override
            public PricesBean createFromParcel(Parcel in) {
                return new PricesBean(in);
            }

            @Override
            public PricesBean[] newArray(int size) {
                return new PricesBean[size];
            }
        };

        public String getUsd() {
            return usd;
        }

        public void setUsd(String usd) {
            this.usd = usd;
        }

        public Object getUsd_foil() {
            return usd_foil;
        }

        public void setUsd_foil(Object usd_foil) {
            this.usd_foil = usd_foil;
        }

        public String getEur() {
            return eur;
        }

        public void setEur(String eur) {
            this.eur = eur;
        }

        public Object getTix() {
            return tix;
        }

        public void setTix(Object tix) {
            this.tix = tix;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(usd);
            dest.writeString(eur);
        }
    }

    public static class RelatedUrisBean implements Parcelable {
        /**
         * gatherer : https://gatherer.wizards.com/Pages/Card/Details.aspx?multiverseid=2838
         * tcgplayer_decks : https://decks.tcgplayer.com/magic/deck/search?contains=Abu+Ja%27far&page=1&partner=Scryfall&utm_campaign=affiliate&utm_medium=api&utm_source=scryfall
         * edhrec : https://edhrec.com/route/?cc=Abu+Ja%27far
         * mtgtop8 : https://mtgtop8.com/search?MD_check=1&SB_check=1&cards=Abu+Ja%27far
         */

        private String gatherer;
        private String tcgplayer_decks;
        private String edhrec;
        private String mtgtop8;

        protected RelatedUrisBean(Parcel in) {
            gatherer = in.readString();
            tcgplayer_decks = in.readString();
            edhrec = in.readString();
            mtgtop8 = in.readString();
        }

        public static final Creator<RelatedUrisBean> CREATOR = new Creator<RelatedUrisBean>() {
            @Override
            public RelatedUrisBean createFromParcel(Parcel in) {
                return new RelatedUrisBean(in);
            }

            @Override
            public RelatedUrisBean[] newArray(int size) {
                return new RelatedUrisBean[size];
            }
        };

        public String getGatherer() {
            return gatherer;
        }

        public void setGatherer(String gatherer) {
            this.gatherer = gatherer;
        }

        public String getTcgplayer_decks() {
            return tcgplayer_decks;
        }

        public void setTcgplayer_decks(String tcgplayer_decks) {
            this.tcgplayer_decks = tcgplayer_decks;
        }

        public String getEdhrec() {
            return edhrec;
        }

        public void setEdhrec(String edhrec) {
            this.edhrec = edhrec;
        }

        public String getMtgtop8() {
            return mtgtop8;
        }

        public void setMtgtop8(String mtgtop8) {
            this.mtgtop8 = mtgtop8;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(gatherer);
            dest.writeString(tcgplayer_decks);
            dest.writeString(edhrec);
            dest.writeString(mtgtop8);
        }
    }

    public static class PurchaseUrisBean implements Parcelable {
        /**
         * tcgplayer : https://shop.tcgplayer.com/product/productsearch?id=3352&partner=Scryfall&utm_campaign=affiliate&utm_medium=api&utm_source=scryfall
         * cardmarket : https://www.cardmarket.com/en/Magic/Products/Singles/Chronicles/Abu-Ja-far?referrer=scryfall&utm_campaign=card_prices&utm_medium=text&utm_source=scryfall
         * cardhoarder : https://www.cardhoarder.com/cards?affiliate_id=scryfall&data%5Bsearch%5D=Abu+Ja%27far&ref=card-profile&utm_campaign=affiliate&utm_medium=card&utm_source=scryfall
         */

        private String tcgplayer;
        private String cardmarket;
        private String cardhoarder;

        protected PurchaseUrisBean(Parcel in) {
            tcgplayer = in.readString();
            cardmarket = in.readString();
            cardhoarder = in.readString();
        }

        public static final Creator<PurchaseUrisBean> CREATOR = new Creator<PurchaseUrisBean>() {
            @Override
            public PurchaseUrisBean createFromParcel(Parcel in) {
                return new PurchaseUrisBean(in);
            }

            @Override
            public PurchaseUrisBean[] newArray(int size) {
                return new PurchaseUrisBean[size];
            }
        };

        public String getTcgplayer() {
            return tcgplayer;
        }

        public void setTcgplayer(String tcgplayer) {
            this.tcgplayer = tcgplayer;
        }

        public String getCardmarket() {
            return cardmarket;
        }

        public void setCardmarket(String cardmarket) {
            this.cardmarket = cardmarket;
        }

        public String getCardhoarder() {
            return cardhoarder;
        }

        public void setCardhoarder(String cardhoarder) {
            this.cardhoarder = cardhoarder;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(tcgplayer);
            dest.writeString(cardmarket);
            dest.writeString(cardhoarder);
        }
    }

    public Card(String object, String id, String oracle_id, int tcgplayer_id, String name, String lang, String released_at, String uri, String scryfall_uri, String layout, boolean highres_image, ImageUrisBean image_uris, String mana_cost, int cmc, String type_line, String oracle_text, String power, String toughness, LegalitiesBean legalities, boolean reserved, boolean foil, boolean nonfoil, boolean oversized, boolean promo, boolean reprint, boolean variation, String set, String set_name, String set_type, String set_uri, String set_search_uri, String scryfall_set_uri, String rulings_uri, String prints_search_uri, String collector_number, boolean digital, String rarity, String card_back_id, String artist, String illustration_id, String border_color, String frame, boolean full_art, boolean textless, boolean booster, boolean story_spotlight, int edhrec_rank, PricesBean prices, RelatedUrisBean related_uris, PurchaseUrisBean purchase_uris, List<Integer> multiverse_ids, List<String> colors, List<String> color_identity, List<String> games, List<String> artist_ids) {
        this.object = object;
        this.id = id;
        this.oracle_id = oracle_id;
        this.tcgplayer_id = tcgplayer_id;
        this.name = name;
        this.lang = lang;
        this.released_at = released_at;
        this.uri = uri;
        this.scryfall_uri = scryfall_uri;
        this.layout = layout;
        this.highres_image = highres_image;
        this.image_uris = image_uris;
        this.mana_cost = mana_cost;
        this.cmc = cmc;
        this.type_line = type_line;
        this.oracle_text = oracle_text;
        this.power = power;
        this.toughness = toughness;
        this.legalities = legalities;
        this.reserved = reserved;
        this.foil = foil;
        this.nonfoil = nonfoil;
        this.oversized = oversized;
        this.promo = promo;
        this.reprint = reprint;
        this.variation = variation;
        this.set = set;
        this.set_name = set_name;
        this.set_type = set_type;
        this.set_uri = set_uri;
        this.set_search_uri = set_search_uri;
        this.scryfall_set_uri = scryfall_set_uri;
        this.rulings_uri = rulings_uri;
        this.prints_search_uri = prints_search_uri;
        this.collector_number = collector_number;
        this.digital = digital;
        this.rarity = rarity;
        this.card_back_id = card_back_id;
        this.artist = artist;
        this.illustration_id = illustration_id;
        this.border_color = border_color;
        this.frame = frame;
        this.full_art = full_art;
        this.textless = textless;
        this.booster = booster;
        this.story_spotlight = story_spotlight;
        this.edhrec_rank = edhrec_rank;
        this.prices = prices;
        this.related_uris = related_uris;
        this.purchase_uris = purchase_uris;
        this.multiverse_ids = multiverse_ids;
        this.colors = colors;
        this.color_identity = color_identity;
        this.games = games;
        this.artist_ids = artist_ids;
    }

    public Card() {}

    @Override
    public String toString() {
        return "Card{" +
                "object='" + object + '\'' +
                ", id='" + id + '\'' +
                ", oracle_id='" + oracle_id + '\'' +
                ", tcgplayer_id=" + tcgplayer_id +
                ", name='" + name + '\'' +
                ", lang='" + lang + '\'' +
                ", released_at='" + released_at + '\'' +
                ", uri='" + uri + '\'' +
                ", scryfall_uri='" + scryfall_uri + '\'' +
                ", layout='" + layout + '\'' +
                ", highres_image=" + highres_image +
                ", image_uris=" + image_uris +
                ", mana_cost='" + mana_cost + '\'' +
                ", cmc=" + cmc +
                ", type_line='" + type_line + '\'' +
                ", oracle_text='" + oracle_text + '\'' +
                ", power='" + power + '\'' +
                ", toughness='" + toughness + '\'' +
                ", legalities=" + legalities +
                ", reserved=" + reserved +
                ", foil=" + foil +
                ", nonfoil=" + nonfoil +
                ", oversized=" + oversized +
                ", promo=" + promo +
                ", reprint=" + reprint +
                ", variation=" + variation +
                ", set='" + set + '\'' +
                ", set_name='" + set_name + '\'' +
                ", set_type='" + set_type + '\'' +
                ", set_uri='" + set_uri + '\'' +
                ", set_search_uri='" + set_search_uri + '\'' +
                ", scryfall_set_uri='" + scryfall_set_uri + '\'' +
                ", rulings_uri='" + rulings_uri + '\'' +
                ", prints_search_uri='" + prints_search_uri + '\'' +
                ", collector_number='" + collector_number + '\'' +
                ", digital=" + digital +
                ", rarity='" + rarity + '\'' +
                ", card_back_id='" + card_back_id + '\'' +
                ", artist='" + artist + '\'' +
                ", illustration_id='" + illustration_id + '\'' +
                ", border_color='" + border_color + '\'' +
                ", frame='" + frame + '\'' +
                ", full_art=" + full_art +
                ", textless=" + textless +
                ", booster=" + booster +
                ", story_spotlight=" + story_spotlight +
                ", edhrec_rank=" + edhrec_rank +
                ", prices=" + prices +
                ", related_uris=" + related_uris +
                ", purchase_uris=" + purchase_uris +
                ", multiverse_ids=" + multiverse_ids +
                ", colors=" + colors +
                ", color_identity=" + color_identity +
                ", games=" + games +
                ", artist_ids=" + artist_ids +
                '}';
    }
}