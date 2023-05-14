package DesignPatern.Builder;

public class order {
      static class builder{
         private int TraDa, BanhMi, Pho, Bun, CoCa, Cafe, Xoi, Kem, TraSua, Chao;

         public builder(){}

          public builder setTraDa(int traDa) {
              TraDa = traDa;
              if(TraDa < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public builder setBanhMi(int banhMi) {
              BanhMi = banhMi;
              if(BanhMi < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public builder setPho(int pho) {
              Pho = pho;
              if(Pho < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public builder setBun(int bun) {
              Bun = bun;
              if(Bun < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public builder setCoCa(int coCa) {
              CoCa = coCa;
              if(CoCa < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public builder setCafe(int cafe) {
              Cafe = cafe;
              if(Cafe < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public builder setXoi(int xoi) {
              Xoi = xoi;
              if(Xoi < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public builder setKem(int kem) {
              Kem = kem;
              if(Kem < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public builder setTraSua(int traSua) {
              TraSua = traSua;
              if(TraSua < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public builder setChao(int chao) {
              Chao = chao;
              if(Chao < 0){
                  throw new RuntimeException("khong the dien gia tri am");
              }
              return this;
          }

          public order create(){
             return new order(TraDa, BanhMi, Pho, Bun, CoCa, Cafe, Xoi, Kem, TraSua, Chao);
          }
      }

     private int TraDa, BanhMi, Pho, Bun, CoCa, Cafe, Xoi, Kem, TraSua, Chao;

    private order(int traDa, int banhMi, int pho, int bun, int coCa, int cafe, int xoi, int kem, int traSua, int chao) {
        TraDa = traDa;
        BanhMi = banhMi;
        Pho = pho;
        Bun = bun;
        CoCa = coCa;
        Cafe = cafe;
        Xoi = xoi;
        Kem = kem;
        TraSua = traSua;
        Chao = chao;
    }

    public int getTraDa() {
        return TraDa;
    }

    public void setTraDa(int traDa) {
        TraDa = traDa;
    }

    public int getBanhMi() {
        return BanhMi;
    }

    public void setBanhMi(int banhMi) {
        BanhMi = banhMi;
    }

    public int getPho() {
        return Pho;
    }

    public void setPho(int pho) {
        Pho = pho;
    }

    public int getBun() {
        return Bun;
    }

    public void setBun(int bun) {
        Bun = bun;
    }

    public int getCoCa() {
        return CoCa;
    }

    public void setCoCa(int coCa) {
        CoCa = coCa;
    }

    public int getCafe() {
        return Cafe;
    }

    public void setCafe(int cafe) {
        Cafe = cafe;
    }

    public int getXoi() {
        return Xoi;
    }

    public void setXoi(int xoi) {
        Xoi = xoi;
    }

    public int getKem() {
        return Kem;
    }

    public void setKem(int kem) {
        Kem = kem;
    }

    public int getTraSua() {
        return TraSua;
    }

    public void setTraSua(int traSua) {
        TraSua = traSua;
    }

    public int getChao() {
        return Chao;
    }

    public void setChao(int chao) {
        Chao = chao;
    }

    @Override
    public String toString() {
        return "order{" +
                "TraDa=" + TraDa +
                ", BanhMi=" + BanhMi +
                ", Pho=" + Pho +
                ", Bun=" + Bun +
                ", CoCa=" + CoCa +
                ", Cafe=" + Cafe +
                ", Xoi=" + Xoi +
                ", Kem=" + Kem +
                ", TraSua=" + TraSua +
                ", Chao=" + Chao +
                '}';
    }
}
