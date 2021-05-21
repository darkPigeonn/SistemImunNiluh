package com.gratiasdeveloper.sistemimunniluh.GridFoto;

import com.gratiasdeveloper.sistemimunniluh.R;

import java.util.ArrayList;

public class DataForo {
    private static  String[] namafoto = {
            "Perbedaan respons non-spesifik dengan respons spesifik",
            "Cara kerja vaksin ",
            "Proses fagositosis.",
            "Gangguan sistem kekebalan tubuh berupa Alergi.",
            "Penyakit autoimun: Myasthenia gravis.",
            "Penyakit autoimun: Lupus.",
            "Imunodefisiensi primer, yakni Severe Combined Immunodeficiency / (bubble boy disease).",
            "Imunodefisiensi primer, yakni Sindrom DiGeorge.",
            "Imunodefisiensi sekunder, yakni Limfoma"
    };

    private static int[] heroesImages={
      R.drawable.gambar_1,
      R.drawable.gambar_2,
      R.drawable.gambar_4,
      R.drawable.gambar_7,
      R.drawable.gambar_8,
      R.drawable.gambar_10,
      R.drawable.gambar_11,
      R.drawable.gambar_12,
      R.drawable.gambar_13
    };

    public static ArrayList<Foto> getListData() {
        ArrayList<Foto> list = new ArrayList<>();
        for (int position = 0; position<namafoto.length;position++) {
            Foto foto = new Foto();
            foto.setName(namafoto[position]);
            foto.setPhoto(heroesImages[position]);
            list.add(foto);
        }

        return list;
    }

    public static ArrayList<Foto> getData(int position) {
        ArrayList<Foto> list = new ArrayList<>();

        Foto foto = new Foto();
        foto.setName(namafoto[position]);
        foto.setPhoto(heroesImages[position]);
        list.add(foto);

        return list;
    }
}
