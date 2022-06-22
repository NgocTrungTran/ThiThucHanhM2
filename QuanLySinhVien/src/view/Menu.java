package view;

import utils.AppUtils;

public class Menu {
    public static void run() {
        StudentView studentView = new StudentView ();
        System.out.println ("---- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ----");
        System.out.println ("Chọn chức năng theo số (để tiếp tục)");
        System.out.println ("1. Xem danh sách sinh viên");
        System.out.println ("2. Thêm mới");
        System.out.println ("3. Cập nhật");
        System.out.println ("4. Xóa");
        System.out.println ("5. Sắp xếp");
//        System.out.println ("6. Đọc từ file");
//        System.out.println ("7. Ghi vào file");
        System.out.println ("6. Thoát");
        int choose = AppUtils.retryChoose ( 1,8 );
        switch (choose) {
            case 1:
                studentView.showStudentList ();
                break;
            case 2:
                studentView.addStudent ();
                break;
            case 3:
                studentView.updateStudent ();
                break;
            case 4:
                studentView.removeStudent ();
                break;
            case 5:
                studentView.sorfStudentByAge ();
                break;
            case 6:
                AppUtils.exit ();
                break;
        }
    }
}
