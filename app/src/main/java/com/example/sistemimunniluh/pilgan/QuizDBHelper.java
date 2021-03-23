package com.example.sistemimunniluh.pilgan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;

import com.example.sistemimunniluh.pilgan.QuizContract.QuestionsTable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azhar Rivaldi on 10/07/2019.
 */

public class QuizDBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "quizzes.db";
    private static final int DB_VERSION = 8;

    public static final String CATEGORY_BIOLOGI = "biologi";


    private final String CREATE_TABLE_QUERY = "CREATE TABLE " + QuizContract.QuestionsTable.TABLE_NAME +
            "(" +
            QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            QuestionsTable.COLUMN_QUESTION + " TEXT, " +
            QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
            QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
            QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
            QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
            QuestionsTable.COLUMN_OPTION5 + " TEXT, " +
            QuestionsTable.COLUMN_ANSWER + " TEXT, " +
            QuestionsTable.COLUMN_CATEGORY + " TEXT" +
            ")";

    private final String DROP_TABLE_QUERY = "DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME;

    private SQLiteDatabase db;
    private List<Question> mQuestionList;

    private Bundle categoryIntentBundle;

    public QuizDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        db.execSQL(CREATE_TABLE_QUERY);

        setUpQuestions();
        insertQuestions();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE_QUERY);
        onCreate(db);
    }

    private void setUpQuestions() {
        mQuestionList = new ArrayList<>();


//no 1
        mQuestionList.add(new Question("Sel B merupakan limfosit yang berperan dalam respon kekebalan humoral. " +
                "Terdapat tiga macam sel B. Salah satunya adalah sel B pengingat. Sel ini berfungsi mengingat antigen yang pernah masuk " +
                "ke tubuh serta menstimulasi pembentukan......",
                "Antibodi atau immunoglobulin",
                "Sel T pembantu untuk mengaktivasi makrofag",
                "Sel B pembelah oleh sel B plasma",
                "Sel B plasma saat terjadi infeksi kedua",
                "Sel T supresor untuk menghentikan respon imun."
                ,"Sel B plasma saat terjadi infeksi kedua", CATEGORY_BIOLOGI));

                //no 2
                mQuestionList.add(new Question("Perhatikan gambar antibodi berikut ini! Antibodi seperti gambar di atas dapat ditemukan pada....",
                "Basofil", "Air Mata",
                "Plasenta", "Plasma darah",
                "Permukaan limfofist B."
                ,"Air Mata", CATEGORY_BIOLOGI));
                //no 3
                mQuestionList.add(new Question("3.\tSeseorang yang pernah menderita cacar air memiliki risiko yang rendah untuk terkena penyakit yang sama untuk kedua kalinya. Hal tersebut dikarenakan orang tersebut telah mendapatkan......",
                "Kekebalan aktif alami",
                "Kekebalan pasif alami",
                "Kekebalan aktif buatan",
                "Kekebalan pasif buatan",
                "Kekebalan pasif"
                ,"Kekebalan aktif alami", CATEGORY_BIOLOGI));
                //no 4
                mQuestionList.add(new Question("Perhatikan pernyataan-pernyataan berikut ini!\n" +
                "1)\tPemberian serum antivenom setelah terkena gigitan ular berbisa\n" +
                "2)\tPemberian kolostrum bagi anak-anak yang baru dilahirkan\n" +
                "3)\tImunisasi Japanese-Encephalitis (JE) untuk mencegah penyakit radang otak\n" +
                "4)\tPemberian serum antibodi poliklonal antitetradoksin bagi orang yang mengonsumsi ikan fugu\n" +
                "5)\tInjeksi racun tetanus yang sudah diinaktivasi\n" +
                "Berdasarkan pernyataan di atas, kekebalan pasif diperoleh melalui tindakan yang ditujukkan oleh nomor.....\n",
                "1),2), dan 3)", "1),2), dan 4)",
                "1),3), dan 4)", "2),3), dan 4)",
                "2),3), dan 5)"
                ,"1),2), dan 4)", CATEGORY_BIOLOGI));

                //no 5
                mQuestionList.add(new Question("Berdasarkan jenis antigen yang terkandung di dalamnya, vaksin dibedakan menjadi live attenuated vaccine, inactivated vaccine, subunit vaccine, dan Vaksin toksoid. Contoh live attenuated vaccine dan inactivated vaccine yang benar secara berurutan adalah....",
                "live attenuated vaccine : IPV dan PCV \n" +
                "inactivate vaccine : OPV dan Vaksin HiB",
                "live attenuated vaccine : IPV dan Vaksin Campak \n" +
                "inactivate vaccine : OPV dan whole-cell pertussis vaccine",
                "live attenuated vaccine : IPV dan Vaksin Tetanus \n" +
                "inactivate vaccine : OPV dan PCV",
                "live attenuated vaccine : OPV dan PCV \n" +
                "inactivate vaccine : IPV dan Vaksin HiB",
                "live attenuated vaccine : OPV dan Vaksin Campak \n" +
                "inactivate vaccine : IPV dan whole-cell pertussis vaccine"
                ,"live attenuated vaccine : OPV dan Vaksin Campak \n" +
                "inactivate vaccine : IPV dan whole-cell pertussis vaccine",
                CATEGORY_BIOLOGI));

                //no 6
                mQuestionList.add(new Question("Saat berwisata ke Cina, Farhan menderita nyeri sendi dan otot , sakit kepala, mengigil, serta menurunnya nafsu makan. Beberapa hari setelahnya, ia mengalami muntah darah, sakit perut, kejang, serta kegagalan hati dan ginjal. Hasil diagnosis dokter, Farhan mengalami penyakit endemis di daerah tempat wisata yang dikunjunginya. Penyakit tersebut dapat dicegah apabila sebelum berangkat ke Eropa Farhan menerima imunisasi.......",
                "JE", "Polio",
                "Ebola", "Demam kuning",
                "Meningococcus"
                ,"JE", CATEGORY_BIOLOGI));

                //no 7
                mQuestionList.add(new Question("7.\tJenis imunisasi ini hanya diberikan satu kali kepada bayi, yaitu saat usia 0-2 bulan. Imunisasi ini berfungsi mencegah penyakit yang diakibatkan oleh Mycrobacterium tuberculosis. Jenis imunisasi yang dimaksud adalah imunisasi.........",
                "HiB", "HB",
                "DTPa", "Pentavalen",
                "BCG"
                ,"BCG", CATEGORY_BIOLOGI));

                //no 8
                mQuestionList.add(new Question("Salah satu komponen yang berperan dalam sistem pertahanan dalam sistem pertahanan nonspesifik adalah protein komplemen yang melakukan pertahanan dengan cara..........",
                "Berikatan dengan sel yang tidak terinfeksi sehingga sel tersebut memproduksi zat yang mampu mencegah replikasi virus",
                "Memproduksi histamin dan prostaglandin",
                "Memicu sel B plasma untuk memproduksi antibodi",
                "Melakukan penelanan partikel asing melalui proses fagositosis",
                "Membentuk lubang pada dinding sel dan membran plasma bakteri"
                ,"Membentuk lubang pada dinding sel dan membran plasma bakteri", CATEGORY_BIOLOGI));

                //no 9
                mQuestionList.add(new Question("Bakteri Streptococcus pneumoniae merupakan patogen yang dapat menyebabkan penyakit radang paru-paru atau pneumonia pada manusia. Saat masuk ke dalam tubuh, bakteri ini akan langsung dikeluarkan oleh silia di trakea. Mekanisme pertahanan tubuh oleh silia tersebut merupakan bentuk pertahanan......",
                "Kimiawi", "Fisik",
                "Mekanis", "Spesifik",
                "Biologis"
                ,"Mekanis", CATEGORY_BIOLOGI));

                //no 10
                mQuestionList.add(new Question("Perhatikan proses fagositosis berikut ini!Peristiwa pada fagositosis yang ditunjuk huruf X adalah.....",
                "Partikel asing melekat pada reseptor membran fagosit.",
                "Enzim acid hydrolase dan peroxidase mencerna seluruh partikel asing hingga hancur.",
                "Partikel mengeluarkan zat yang dapat menarik fagosit untuk mendekat.",
                "Fagosit mati bersamaan dengan matinya sel-sel tubuh yang terinfeksi dan patogen.",
                "Membran fagosit menyelubungi seluruh permukaan partikel asing dan menelannya ke sitoplasma. "
                ,"Enzim acid hydrolase dan peroxidase mencerna seluruh partikel asing hingga hancur.", CATEGORY_BIOLOGI));

    }

    private void insertQuestions() {
        for(Question q : mQuestionList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(QuestionsTable.COLUMN_QUESTION, q.getmQuestion());
            contentValues.put(QuestionsTable.COLUMN_OPTION1, q.getmOption1());
            contentValues.put(QuestionsTable.COLUMN_OPTION2, q.getmOption2());
            contentValues.put(QuestionsTable.COLUMN_OPTION3, q.getmOption3());
            contentValues.put(QuestionsTable.COLUMN_OPTION4, q.getmOption4());
            contentValues.put(QuestionsTable.COLUMN_OPTION5, q.getmOption5());
            contentValues.put(QuestionsTable.COLUMN_ANSWER, q.getmAnswer());
            contentValues.put(QuestionsTable.COLUMN_CATEGORY, q.getmCategory());
            db.insert(QuestionsTable.TABLE_NAME, null, contentValues);
        }
    }

    public ArrayList<Question> getAllQuestions(String categoryID) {
        Log.d("TAG", "Getting all questions for : " + categoryID);
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        String SELECT_TABLE_QUERY = "SELECT * FROM " + QuestionsTable.TABLE_NAME + " WHERE " + QuestionsTable.COLUMN_CATEGORY + " = \"" + categoryID + "\"";
        Cursor cursor = db.rawQuery(SELECT_TABLE_QUERY, null);
        if(cursor.moveToFirst()) {
            do {
                Question question = new Question();
                question.setmQuestion(cursor.getString(cursor.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setmOption1(cursor.getString(cursor.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setmOption2(cursor.getString(cursor.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setmOption3(cursor.getString(cursor.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setmOption4(cursor.getString(cursor.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));

                question.setmOption5(cursor.getString(cursor.getColumnIndex(QuestionsTable.COLUMN_OPTION5)));
                question.setmAnswer(cursor.getString(cursor.getColumnIndex(QuestionsTable.COLUMN_ANSWER)));
                questionList.add(question);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return questionList;
    }
}
