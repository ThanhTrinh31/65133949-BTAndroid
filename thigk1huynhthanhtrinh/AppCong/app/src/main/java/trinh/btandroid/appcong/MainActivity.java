package trinh.btandroid.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Đây là bộ lắng nghe và xử lý sự kiện lên nút Tính Tổng
    public void XuLyCong(View view){
        // Tìm, tham chiếu đến điều khiển trên tệp XML, mapping sang java file
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        // Lấy dữ liệu về từ điều khiển số A
        String strA = editTextSoA.getText().toString();
        // Lấy dữ liệu về từ điều khiển số A
        String strB = editTextSoB.getText().toString();

        // Chuyển dữ liệu sang dạng số
           int so_A = Integer.parseInt(strA);
           int so_B = Integer.parseInt(strB);
        // Tính toán theo yêu cầu
        int Tong = so_A + so_B;
        String strTong = String.valueOf(Tong);
        // Hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
}