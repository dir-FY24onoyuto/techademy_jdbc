package dbSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectSample01 {

    public static void main(String[] args) {
        
        try {
            //１．ドライバーのクラスをjava上で読み込む
             Class.forName("com.mysql.cj.jdbc.Driver");

            //２．DBと接続する
             Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "password"
                    );
             
            //３．DBとやりとりする窓口（Statementオブジェクト）の作成
            
            //４. 5.Select文の実行と結果を格納/代入
            
            //6.結果を表示する
      
        } catch (ClassNotFoundException e) {
            System.err.println("JDBCドライバーのロードに失敗しました。");
            e.printStackTrace();
        }
          
         catch (SQLException e) {
             System.err.println("データベースに異常が発生しました");
             e.printStackTrace();
        }
             //７．接続を閉じる
        
        //chapter4 7接続を閉じる　から
    }

}
