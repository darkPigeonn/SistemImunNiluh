package com.gratiasdeveloper.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.gratiasdeveloper.sistemimunniluh.pilgan.HasilKuis;

import java.util.ArrayList;


public class hal_6_soalLatihan extends AppCompatActivity {


    private ConstraintLayout mParentLayout;
    private TextView mScoreTextView;
    private TextView mRemaningQuestionsTextView;
    private int mTotalQuestions;
    private int mScore;


//dari yang baru

    int flag;
    private static final String TAG ="" ;
    private RadioButton mActiveRadioButton;
    TextView kuis;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD, PilihanE;
    int nomor = 0;
    public static int hasil, benar, salah;

    ImageView gambarsoal;
    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "1.\tSel B merupakan limfosit yang berperan dalam respon kekebalan humoral. Terdapat tiga macam sel B. Salah satunya adalah sel B pengingat. Sel ini berfungsi mengingat antigen yang pernah masuk ke tubuh serta menstimulasi pembentukan......",
            "2.\tAntibodi seperti gambar di bawah dapat ditemukan pada....",
            "3.\tSeseorang yang pernah menderita cacar air memiliki risiko yang rendah untuk terkena penyakit yang sama untuk kedua kalinya. Hal tersebut dikarenakan orang tersebut telah mendapatkan......",
            "4.\tPerhatikan pernyataan-pernyataan berikut ini!\n" +
                    "1)\tPemberian serum antivenom setelah terkena gigitan ular berbisa\n" +
                    "2)\tPemberian kolostrum bagi anak-anak yang baru dilahirkan\n" +
                    "3)\tImunisasi Japanese-Encephalitis (JE) untuk mencegah penyakit radang otak\n" +
                    "4)\tPemberian serum antibodi poliklonal antitetradoksin bagi orang yang mengonsumsi ikan fugu\n" +
                    "5)\tInjeksi racun tetanus yang sudah diinaktivasi\n" +
                    "Berdasarkan pernyataan di atas, kekebalan pasif diperoleh melalui tindakan yang ditujukkan oleh nomor.....\n",
            "5.\tBerdasarkan jenis antigen yang terkandung di dalamnya, vaksin dibedakan menjadi live attenuated vaccine, inactivated vaccine, subunit vaccine, dan Vaksin toksoid. Contoh live attenuated vaccine dan inactivated vaccine yang benar secara berurutan adalah....",
            "6.\tSaat berwisata ke Cina, Farhan menderita nyeri sendi dan otot , sakit kepala, mengigil, serta menurunnya nafsu makan. Beberapa hari setelahnya, ia mengalami muntah darah, sakit perut, kejang, serta kegagalan hati dan ginjal. Hasil diagnosis dokter, Farhan mengalami penyakit endemis di daerah tempat wisata yang dikunjunginya. Penyakit tersebut dapat dicegah apabila sebelum berangkat ke Eropa Farhan menerima imunisasi.......",
            "7.\tJenis imunisasi ini hanya diberikan satu kali kepada bayi, yaitu saat usia 0-2 bulan. Imunisasi ini berfungsi mencegah penyakit yang diakibatkan oleh Mycrobacterium tuberculosis. Jenis imunisasi yang dimaksud adalah imunisasi.........",
            "8.\tSalah satu komponen yang berperan dalam sistem pertahanan nonspesifik adalah protein komplemen yang melakukan pertahanan dengan cara..........",
            "9.\tBakteri Streptococcus pneumoniae merupakan patogen yang dapat menyebabkan penyakit radang paru-paru atau pneumonia pada manusia. Saat masuk ke dalam tubuh, bakteri ini akan langsung dikeluarkan oleh silia di trakea. Mekanisme pertahanan tubuh oleh silia tersebut merupakan bentuk pertahanan......",
            "10.\tPeristiwa pada fagositosis yang ditunjuk huruf X pada gambar dibawah ini adalah....."


    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "a.\tAntibodi atau immunoglobulin", "b.\tSel T pembantu untuk mengaktivasi makrofag", "c.\tSel B pembelah oleh sel B plasma", "d.\tSel B plasma saat terjadi infeksi kedua", "e.\tSel T supresor untuk menghentikan respon imun.",
            "a.\tBasofil", "b.\tAir mata", "c.\tPlasenta", "d.\tPlasma darah", "e.\tPermukaan limfosit B",
            "a.\tKekebalan aktif alami", "b.\tKekebalan pasif alami", "c.\tKekebalan aktif buatan", "d.\tKekebalan pasif buatan","e.\tKekebalan pasif",
            "a.\t1), 2), dan 3)", "b.\t1), 2), dan 4)", "c.\t1), 3), dan 4)", "d.\t2), 3), dan 4)","e.\t2), 3), dan 5)",
            "a.\tlive attenuated vaccine: IPV dan PCV\t, inactivated vaccine:OPV dan Vaksin HiB", "b.\tlive attenuated vaccine:IPV dan Vaksin Campak\t, inactivated vaccine:OPV dan whole-cell pertussis vaccine", "c.\tlive attenuated vaccine:IPV dan Vaksin Tetanus\t, inactivated vaccine:OPV dan PCV", "d.\tlive attenuated vaccine:OPV dan PCV\t,inactivated vaccine:IPV dan Vaksin HiB" ,"e.\tlive attenuated vaccine:OPV dan Vaksin Campak\t,inactivated vaccine:IPV dan whole-cell pertussis vaccine",
            "a.\tJE","b.\tPolio","c.\tEbola","d.\tDemam kuning","e.\tMeningococcus ",
            "a.\tHiB","b.\tHB","c.\tDTPa","d.\tPentavalen","e.\tBCG",
            "a.\tBerikatan dengan sel yang tidak terinfeksi sehingga sel tersebut memproduksi zat yang mampu mencegah replikasi virus","b.\tMemproduksi histamin dan prostaglandin","c.\tMemicu sel B plasma untuk memproduksi antibodi","d.\tMelakukan penelanan partikel asing melalui proses fagositosis","e.\tMembentuk lubang pada dinding sel dan membran plasma bakteri",
            "a.\tKimiawi","b.\tFisik","c.\tMekanis","d.\tSpesifik","e.\tBiologis",
            "a.\tPartikel asing melekat pada reseptor membran fagosit.","b.\tEnzim acid hydrolase dan peroxidase mencerna seluruh partikel asing hingga hancur","c.\tPartikel mengeluarkan zat yang dapat menarik fagosit untuk mendekat","d.\tFagosit mati bersamaan dengan matinya sel-sel tubuh yang terinfeksi dan patogen.","e.\tMembran fagosit menyelubungi seluruh permukaan partikel asing dan menelannya ke sitoplasma"
    };

    //jawaban benar
    String[] jawaban_benar = new String[]{
            "d.\tSel B plasma saat terjadi infeksi kedua",
            "b.\tAir mata",
            "a.\tKekebalan aktif alami",
            "b.\t1), 2), dan 4)",
            "e.\tlive attenuated vaccine:OPV dan Vaksin Campak\t,inactivated vaccine:IPV dan whole-cell pertussis vaccine",
            "a.\tJE",
            "e.\tBCG",
            "e.\tMembentuk lubang pada dinding sel dan membran plasma bakteri",
            "c.\tMekanis",
            "b.\tEnzim acid hydrolase dan peroxidase mencerna seluruh partikel asing hingga hancur"
    };

    int[] gambar_soal = new int[] {
            R.drawable.soal_2,
            R.drawable.soal_10
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_6_soal_latihan);
        gambarsoal = findViewById(R.id.gambarsoal);
        kuis = findViewById(R.id.question);
        rg = findViewById(R.id.pilihan);
        PilihanA = findViewById(R.id.rb1);
        PilihanB =findViewById(R.id.rb2);
        PilihanC = findViewById(R.id.rb3);
        PilihanD = findViewById(R.id.rb4);
        PilihanE = findViewById(R.id.rb5);
        Log.d("error", "onCreate: "+pertanyaan_kuis[nomor]);
        kuis.setText(pertanyaan_kuis[nomor]);

        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);
        PilihanE.setText(pilihan_jawaban[4]);

        flag = 0;

//        rg.check(0);
        benar = 0;
        salah = 0;

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                findRadioButton(checkedId);

            }
        });
    }

    @SuppressLint("ResourceAsColor")
    public void next(View view) {

        if (flag != 0) {

            nomor++;


            PilihanA.setClickable(true);
            PilihanA.setChecked(false);
            setRadioButtonBackgroundColor(PilihanA, R.color.white);
            PilihanA.setTextColor(getResources().getColor(R.color.black));

            PilihanB.setClickable(true);
            PilihanB.setChecked(false);
            setRadioButtonBackgroundColor(PilihanB, R.color.white);
            PilihanB.setTextColor(getResources().getColor(R.color.black));
            PilihanC.setChecked(false);
            PilihanC.setClickable(true);
            setRadioButtonBackgroundColor(PilihanC, R.color.white);
            PilihanC.setTextColor(getResources().getColor(R.color.black));

            PilihanD.setClickable(true);
            PilihanD.setChecked(false);
            setRadioButtonBackgroundColor(PilihanD, R.color.white);
            PilihanD.setTextColor(getResources().getColor(R.color.black));


            PilihanE.setClickable(true);
            PilihanE.setChecked(false);
            setRadioButtonBackgroundColor(PilihanE, R.color.white);
            PilihanE.setTextColor(getResources().getColor(R.color.black));


            if (nomor < pertanyaan_kuis.length) {
                gambarsoal.setVisibility(View.GONE);
                if(nomor == 1){
                    gambarsoal.setVisibility(View.VISIBLE);
                    gambarsoal.setImageResource(R.drawable.soal_2);
                }
                if(nomor == 9){

                    gambarsoal.setVisibility(View.VISIBLE);
                    gambarsoal.setImageResource(R.drawable.soal_10);
                }
                kuis.setText(pertanyaan_kuis[nomor]);


                PilihanA.setText(pilihan_jawaban[(nomor * 5) + 0]);
                PilihanB.setText(pilihan_jawaban[(nomor * 5) + 1]);
                PilihanC.setText(pilihan_jawaban[(nomor * 5) + 2]);
                PilihanD.setText(pilihan_jawaban[(nomor * 5) + 3]);
                PilihanE.setText(pilihan_jawaban[(nomor * 5) + 4]);



            } else {
                hasil = benar * 20;
                Intent selesai = new Intent(getApplicationContext(), HasilKuis.class);
                startActivity(selesai);
            }
            flag = 0;
        }
        else {
            Toast.makeText(this, "Silahkan pilih jawaban terlebih dahulu!", Toast.LENGTH_SHORT).show();
        }



    }



    public void findRadioButton(int checked) {
        flag = 1;
        String key = jawaban_benar[nomor];
        switch (checked) {
            case R.id.rb1:
                checkAnswer(PilihanA,jawaban_benar[nomor]);
               // Toast.makeText(this, "Jawaban benar"+rg, Toast.LENGTH_SHORT).show();
                rg.clearCheck();
                break;
            case R.id.rb2:
                checkAnswer(PilihanB,jawaban_benar[nomor]);
               // Toast.makeText(this, "Jawaban benar"+nomor, Toast.LENGTH_SHORT).show();
                rg.clearCheck();
                break;
            case R.id.rb3:
                checkAnswer(PilihanC,jawaban_benar[nomor]);
               // Toast.makeText(this, "Jawaban benar"+nomor, Toast.LENGTH_SHORT).show();
                rg.clearCheck();
                break;
            case R.id.rb4:
                checkAnswer(PilihanD,jawaban_benar[nomor]);
               // Toast.makeText(this, "Jawaban benar"+nomor, Toast.LENGTH_SHORT).show();
                rg.clearCheck();
                break;

            case R.id.rb5:
                checkAnswer(PilihanE,jawaban_benar[nomor]);
                rg.clearCheck();
                break;
        }
    }
    public void checkAnswer(final RadioButton rb, String answer) {
        int id = -1;
        int count = rg.getChildCount();
        ArrayList<RadioButton> listOfRadioButtons = new ArrayList<RadioButton>();
        for (int i=0;i<count;i++) {
            View o = rg.getChildAt(i);
            if (o instanceof RadioButton) {
                listOfRadioButtons.add((RadioButton)o);
            }
        }



        if (rb.getText().equals(answer)) {
            setRadioButtonBackgroundColor(rb, R.color.transparent_green);
            benar++;
            Toast.makeText(this, "Selamat jawaban kamu benar!", Toast.LENGTH_SHORT).show();

        } else {
            setRadioButtonBackgroundColor(rb, R.color.transparent_red);
            salah++;
            Toast.makeText(this, "Jawabanmu kurang tepat!", Toast.LENGTH_SHORT).show();
            ;

            for (RadioButton radioButton : listOfRadioButtons) {
                if (radioButton.getText().equals(answer)) {
                    setRadioButtonBackgroundColor(radioButton, R.color.transparent_green);
                    id = radioButton.getId();
                }
            }
        }


        for (RadioButton radioButton : listOfRadioButtons) {

            radioButton.setClickable(false);
            if (radioButton.getId() != rb.getId() && radioButton.getId() != id) {
                setRadioButtonBackgroundColor(radioButton, R.color.transparent_grey);
                radioButton.setTextColor(getResources().getColor(R.color.transparent_black));
            }
        }



    }
    private void setRadioButtonBackgroundColor(RadioButton button, int colorId) {
        button.getBackground().setColorFilter(Color.parseColor(this.getString(colorId)), PorterDuff.Mode.MULTIPLY);
    }
}