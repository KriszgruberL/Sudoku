//package be.technifutur.sudoku.Samurai;
//
//import be.technifutur.sudoku.SudokuModel;
//import be.technifutur.sudoku.SudokuVue;
//import be.technifutur.sudoku.sudoku4x4.SudokuModel4x4;
//
//public class SudokuVueSamurai implements SudokuVue {
//    private static String format = """
//                +-------+-------+-------+       +-------+-------+-------+
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                +-------+-------+-------+       +-------+-------+-------+
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                +-------+-------+-------+-------+-------+-------+-------+
//                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
//                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
//                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
//                +-------+-------+-------+-------+-------+-------+-------+
//                                | . . . | . . . | . . . |
//                                | . . . | . . . | . . . |
//                                | . . . | . . . | . . . |
//                +-------+-------+-------+-------+-------+-------+-------+
//                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
//                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
//                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
//                +-------+-------+-------+-------+-------+-------+-------+
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                +-------+-------+-------+       +-------+-------+-------+
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                | . . . | . . . | . . . |       | . . . | . . . | . . . |
//                +-------+-------+-------+       +-------+-------+-------+""".replace(".", "%s");
//
//    private SudokuModelSamurai model;
//
//    public SudokuVueSamurai(SudokuModelSamurai model) {
//        this.model = model;
//    }
//
//    @Override
//    public String getScreen() {
//        Character[] val = new Character[model.cellCount()];
//        int pos = 0;
//        for (int l = 0; l < getModel().getMaxLine(); l++) {
//            for (int c = 0; c < getModel().getMaxColumn(); c++) {
//                if (model.isEmpty(l,c)){
//                    val[pos] = '.';
//                } else {
//                    val[pos] = model.getValue(l,c);
//                }
//                pos++;
//            }
//        }
//        return String.format(format, val);
//    }
//
//    @Override
//    public SudokuModel getModel() {
//        return this.model;
//    }
//}
