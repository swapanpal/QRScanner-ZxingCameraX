package android.example.com.qrscanner_zxingcamerax;

public interface QRCodeFoundListener {
    void onQRCodeFound(String qrCode);
    void qrCodeNotFound();

}
