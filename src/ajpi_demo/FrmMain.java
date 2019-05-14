package ajpi_demo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.GraphicsEnvironment;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.Element;
import javax.swing.text.StyledDocument;
import javax.swing.text.rtf.RTFEditorKit;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;
import javax.swing.JTabbedPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfDocument;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;


public class FrmMain extends javax.swing.JFrame {
        public FrmMain() 
        {
			// testing git - branch a
            initComponents();
            loadFont();
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setTitle("NEXT GEN TEXT EDITOR");
            setIconImage(new ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\tabbednotepad.png").getImage());
            
            jTextPane1.getDocument().addUndoableEditListener(
                new UndoableEditListener() {
                    public void undoableEditHappened(UndoableEditEvent e) {
                        
                }
                });
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSelectColor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbFont = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jcbSelectSize = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        open_text = new javax.swing.JMenuItem();
        ortf = new javax.swing.JMenuItem();
        openword = new javax.swing.JMenuItem();
        opdf = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        SAVE_TEXT = new javax.swing.JMenuItem();
        srtf = new javax.swing.JMenuItem();
        saveword = new javax.swing.JMenuItem();
        spdf = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        past = new javax.swing.JMenuItem();
        selectall = new javax.swing.JMenuItem();
        undo = new javax.swing.JMenuItem();
        redo = new javax.swing.JMenuItem();
        time_date = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        regular = new javax.swing.JMenuItem();
        bold = new javax.swing.JMenuItem();
        italic = new javax.swing.JMenuItem();
        underline = new javax.swing.JMenuItem();
        bi = new javax.swing.JMenuItem();
        bu = new javax.swing.JMenuItem();
        iu = new javax.swing.JMenuItem();
        biu = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        rahtml = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        jPopupMenu1.setBackground(new java.awt.Color(51, 255, 51));
        jPopupMenu1.setForeground(new java.awt.Color(255, 0, 204));

        jMenuItem3.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\paste.png")); // NOI18N
        jMenuItem3.setText("Paste");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, past, org.jdesktop.beansbinding.ELProperty.create("${selected}"), jMenuItem3, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copy.png"))); // NOI18N
        jMenuItem7.setText("Copy");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnNew.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\new.png")); // NOI18N
        btnNew.setToolTipText("new");
        btnNew.setFocusable(false);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNew);

        btnOpen.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\open.png")); // NOI18N
        btnOpen.setToolTipText("open");
        btnOpen.setFocusable(false);
        btnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOpen);

        btnSave.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\save.png")); // NOI18N
        btnSave.setToolTipText("Save");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSave);

        btnSelectColor.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\color.png")); // NOI18N
        btnSelectColor.setToolTipText("color");
        btnSelectColor.setFocusable(false);
        btnSelectColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSelectColor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSelectColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectColorActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSelectColor);

        jLabel1.setText("Font");
        jToolBar1.add(jLabel1);

        jcbFont.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbFont.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFontActionPerformed(evt);
            }
        });
        jToolBar1.add(jcbFont);

        jLabel2.setText("Size");
        jToolBar1.add(jLabel2);

        jcbSelectSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "14", "18", "22", "26", "30", "34", "36", "40", "44", "48", "52" }));
        jcbSelectSize.setToolTipText("size");
        jcbSelectSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectSizeActionPerformed(evt);
            }
        });
        jToolBar1.add(jcbSelectSize);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 24));

        lblStatus.setText("Key");
        lblStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblStatus);

        lblPosition.setText("n chars");
        jPanel1.add(lblPosition);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jTextPane1.setCaretColor(new java.awt.Color(51, 51, 255));
        jTextPane1.setComponentPopupMenu(jPopupMenu1);
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextPane1.setDoubleBuffered(true);
        jTextPane1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextPane1CaretUpdate(evt);
            }
        });
        jTextPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextPane1MouseReleased(evt);
            }
        });
        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPane1KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        mnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnNew.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\new.png")); // NOI18N
        mnNew.setText("New");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        jMenu1.add(mnNew);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.png"))); // NOI18N
        jMenu7.setText("Open");

        open_text.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open_text.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\text 2.png")); // NOI18N
        open_text.setText("Open");
        open_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_textActionPerformed(evt);
            }
        });
        jMenu7.add(open_text);

        ortf.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ortf.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\rtf open.png")); // NOI18N
        ortf.setText("Open as .rtf");
        ortf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ortf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ortfActionPerformed(evt);
            }
        });
        jMenu7.add(ortf);

        openword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        openword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/word open.png"))); // NOI18N
        openword.setText("Open word document");
        openword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openwordActionPerformed(evt);
            }
        });
        jMenu7.add(openword);

        opdf.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        opdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf open.png"))); // NOI18N
        opdf.setText("Open PDF");
        opdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opdfActionPerformed(evt);
            }
        });
        jMenu7.add(opdf);

        jMenu1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\save.png")); // NOI18N
        jMenu8.setText("Save");

        SAVE_TEXT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SAVE_TEXT.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\text save.png")); // NOI18N
        SAVE_TEXT.setText("Save");
        SAVE_TEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE_TEXTActionPerformed(evt);
            }
        });
        jMenu8.add(SAVE_TEXT);

        srtf.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        srtf.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\rtf save.jpg")); // NOI18N
        srtf.setText("Save as rtf");
        srtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srtfActionPerformed(evt);
            }
        });
        jMenu8.add(srtf);

        saveword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/word save.jpg"))); // NOI18N
        saveword.setText("Save word document");
        saveword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savewordActionPerformed(evt);
            }
        });
        jMenu8.add(saveword);

        spdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf edit.png"))); // NOI18N
        spdf.setText("Save PDF");
        spdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spdfActionPerformed(evt);
            }
        });
        jMenu8.add(spdf);

        jMenu1.add(jMenu8);
        jMenu1.add(jSeparator1);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        exit.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\exit.png")); // NOI18N
        exit.setText("Exit");
        exit.setToolTipText("Exists ");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        jMenu3.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        jMenu3.add(copy);

        past.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        past.setText("Paste");
        past.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastActionPerformed(evt);
            }
        });
        jMenu3.add(past);

        selectall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        selectall.setText("Select All");
        selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallActionPerformed(evt);
            }
        });
        jMenu3.add(selectall);

        undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        jMenu3.add(undo);

        redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        redo.setText("Redo");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });
        jMenu3.add(redo);

        time_date.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        time_date.setText("Time & Date");
        time_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_dateActionPerformed(evt);
            }
        });
        jMenu3.add(time_date);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Format");

        jMenu5.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\Font.PNG")); // NOI18N
        jMenu5.setText("Font Style");

        regular.setText("Regular");
        regular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularActionPerformed(evt);
            }
        });
        jMenu5.add(regular);

        bold.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bold.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\Bold.PNG")); // NOI18N
        bold.setText("Bold");
        bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldActionPerformed(evt);
            }
        });
        jMenu5.add(bold);

        italic.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        italic.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\Italic.PNG")); // NOI18N
        italic.setText("Italic");
        italic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicActionPerformed(evt);
            }
        });
        jMenu5.add(italic);

        underline.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\Underline.PNG")); // NOI18N
        underline.setText("Underline");
        underline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underlineActionPerformed(evt);
            }
        });
        jMenu5.add(underline);

        bi.setText("Bold + Italic");
        bi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biActionPerformed(evt);
            }
        });
        jMenu5.add(bi);

        bu.setText("Bold + Underline");
        bu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buActionPerformed(evt);
            }
        });
        jMenu5.add(bu);

        iu.setText("Italic + Underline");
        iu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iuActionPerformed(evt);
            }
        });
        jMenu5.add(iu);

        biu.setText("Bold + Italic + Underline ");
        biu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biuActionPerformed(evt);
            }
        });
        jMenu5.add(biu);

        jMenu4.add(jMenu5);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Run");

        rahtml.setIcon(new javax.swing.ImageIcon("D:\\zzzzz\\New folder\\java pro\\AJPI_Demo\\src\\images\\Capture.PNG")); // NOI18N
        rahtml.setText("Run as html");
        rahtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rahtmlActionPerformed(evt);
            }
        });
        jMenu6.add(rahtml);

        jMenuBar1.add(jMenu6);

        jMenu9.setText("Themes");

        jMenuItem1.setText("Nimbuz");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem1);

        jMenuItem2.setText("Windows");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem2);

        jMenuItem4.setText("Windows Classic");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuItem5.setText("Motiff");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenuItem6.setText("Metal");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem6);

        jMenuBar1.add(jMenu9);

        jMenu2.setBackground(new java.awt.Color(0, 204, 51));
        jMenu2.setText("Help");

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu2.add(about);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Help");
        jMenu2.add(jCheckBoxMenuItem1);
        jMenu2.add(jSeparator2);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Check update");
        jMenu2.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_exitActionPerformed
    Color selectColor;
    String filelocaton;
    Style style;
    UndoManager um;
    
    private void btnSelectColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectColorActionPerformed
        //JOptionPane.showInputDialog(jTextPane1,"fore color","back color");
        Color jColor = selectColor;
        int zx=JOptionPane.showConfirmDialog(jTextPane1, "fore color", "CHOOSE COLOR", JOptionPane.INFORMATION_MESSAGE);
        if(zx==0)
        {
            if ((jColor = JColorChooser.showDialog(this, "Select color", jColor)) != null) 
            {
                    selectColor = jColor;
                 style = jTextPane1.addStyle("",null);
               StyleConstants.setForeground(style, selectColor);
               jTextPane1.setCharacterAttributes(style, false);
            }
        }
        else if(zx==2) 
                {
                    
                }
        else
        {
            if ((jColor = JColorChooser.showDialog(this, "Select color", jColor)) != null) 
            {
                    selectColor = jColor;
                 style = jTextPane1.addStyle("",null);
               StyleConstants.setBackground(style, selectColor);
               jTextPane1.setCharacterAttributes(style, false);
            }
        }
        
    }//GEN-LAST:event_btnSelectColorActionPerformed

    private void jcbSelectSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelectSizeActionPerformed
        jTextPane1.requestFocus();
         style = jTextPane1.addStyle("",null);
        String getSize = jcbSelectSize.getSelectedItem().toString();
        StyleConstants.setFontSize(style,Integer.parseInt(getSize));
       jTextPane1.setCharacterAttributes(style, false);
       
      /*int a=jTextPane1.getSelectionStart();
       int b=jTextPane1.getSelectionEnd()-a;
       jTextPane1.getStyledDocument().setCharacterAttributes(a, b, style, false);
           Font f = jTextPane1.getFont();
            jTextPane1.setFont(new Font(f.getFontName(),
                   f.getStyle(), Integer.parseInt(getSize)));*/
    }//GEN-LAST:event_jcbSelectSizeActionPerformed

    private void jcbFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFontActionPerformed
       jTextPane1.requestFocus();
         style = jTextPane1.addStyle("",null);
       StyleConstants.setFontFamily(style, jcbFont.getSelectedItem().toString());
       jTextPane1.setCharacterAttributes(style, false);
    }//GEN-LAST:event_jcbFontActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        SAVE_TEXTActionPerformed(evt);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        open_textActionPerformed(evt);
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        //jTextPane1.setText("");
        JTabbedPane jtb=new JTabbedPane();
        //jtb.addTab("new tab", new ScrollPan;
        Object source=evt.getSource();
        if(source instanceof JMenuItem)
        {
            switch(evt.getActionCommand())
            {
                
                   // jtb.addTab("new tab", null);
            }
        }
       
    }//GEN-LAST:event_btnNewActionPerformed

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        jTextPane1.setText("");
    }//GEN-LAST:event_mnNewActionPerformed

	private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        jTextPane1.copy();
    }//GEN-LAST:event_copyActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        jTextPane1.cut();
    }//GEN-LAST:event_cutActionPerformed

    private void selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallActionPerformed
      jTextPane1.selectAll();
    }//GEN-LAST:event_selectallActionPerformed

    private void pastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastActionPerformed
        jTextPane1.paste();
    }//GEN-LAST:event_pastActionPerformed

	 private void regularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularActionPerformed
      try
      {
      style = jTextPane1.addStyle("",null); 
       StyleConstants.setBold(style, false);
       StyleConstants.setItalic(style, false);
       StyleConstants.setUnderline(style, false);
       jTextPane1.setCharacterAttributes(style, false);
        
      }
      catch(Exception e)
      {
              
      } 
    }//GEN-LAST:event_regularActionPerformed

    private void boldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldActionPerformed
          style = jTextPane1.addStyle("b",null);
            StyleConstants.setBold(style, true);
            StyleConstants.setItalic(style, false);
            StyleConstants.setUnderline(style, false);
            jTextPane1.setCharacterAttributes(style, false);
    }//GEN-LAST:event_boldActionPerformed
	
	private void italicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicActionPerformed
          style = jTextPane1.addStyle("i", null);
         StyleConstants.setBold(style, false);
         StyleConstants.setUnderline(style, false);
          StyleConstants.setItalic(style, true);
          jTextPane1.setCharacterAttributes(style, false);
          //jTextPane1.setFont(new Font(jcbFont.getSelectedItem().toString(), Font.ITALIC, Integer.parseInt(jcbSelectSize.getSelectedItem().toString())));
    }//GEN-LAST:event_italicActionPerformed
	
	private void underlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underlineActionPerformed
            style = jTextPane1.addStyle("u",null);
            StyleConstants.setBold(style, false);
            StyleConstants.setItalic(style, false);
            StyleConstants.setUnderline(style, true);
            jTextPane1.setCharacterAttributes(style, false);
    }//GEN-LAST:event_underlineActionPerformed
	
	private void biActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biActionPerformed
            style = jTextPane1.addStyle("",null);
            StyleConstants.setUnderline(style, false);
            StyleConstants.setBold(style, true);
            StyleConstants.setItalic(style, true);
            jTextPane1.setCharacterAttributes(style, false);
    }//GEN-LAST:event_biActionPerformed

    private void buActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buActionPerformed
       style = jTextPane1.addStyle("",null);
       StyleConstants.setItalic(style, false);
            StyleConstants.setBold(style, true);
            StyleConstants.setUnderline(style, true);
            jTextPane1.setCharacterAttributes(style, false);
    }//GEN-LAST:event_buActionPerformed

    private void iuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iuActionPerformed
        style = jTextPane1.addStyle("",null);
        StyleConstants.setBold(style, false);
            StyleConstants.setUnderline(style, true);
            StyleConstants.setItalic(style, true);
            jTextPane1.setCharacterAttributes(style, false);
    }//GEN-LAST:event_iuActionPerformed

    private void biuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biuActionPerformed
        style = jTextPane1.addStyle("",null);
            StyleConstants.setBold(style, true);
            StyleConstants.setItalic(style, true);
            StyleConstants.setUnderline(style, true);
            jTextPane1.setCharacterAttributes(style, false);
    }//GEN-LAST:event_biuActionPerformed
String fileName;
FileFilter filter;
JFileChooser fc = new JFileChooser();
File file;
    public String open_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_textActionPerformed
                jTextPane1.setText("");
                TextFilter fillter = new TextFilter();
		String str4=" ";
                fc.setDialogTitle("OPEN TEXT FILE");
                fc.setFileFilter(fillter);
                
                    if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) 
                        {
                            fileName = fc.getSelectedFile().getAbsolutePath();
                        } 
                    else
                        {
                            return null;
                        }
		file=new File(fileName);
                
        try {
                FileInputStream fobj = new FileInputStream(file);
                int len = (int)file.length();
                char str5;
                    for(int j=0;j<len;j++)
                        {        
                            str5 = (char) fobj.read();
                            str4=str4 + str5;
                        } 
		jTextPane1.setText(str4);
                filelocaton=fileName;
                this.setTitle(fileName);                
            }
         catch (IOException ex) 
         {
              Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
         }
        return fileName;
    }//GEN-LAST:event_open_textActionPerformed

    private void SAVE_TEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE_TEXTActionPerformed
        try
            {  
                fc.setDialogTitle("SAVE TEXT FILE");
                TextFilter fillter = new TextFilter();
                fc.setFileFilter(fillter);
                    if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) 
                        {
                            fileName = fc.getSelectedFile().getAbsolutePath();
                            String str6=jTextPane1.getText();
                            int len1=str6.length();
                            byte buf[]=str6.getBytes();
                            
                            file=new File(fileName);
                            FileOutputStream fobj1;
                            fobj1 = new FileOutputStream(file);
                            for(int k=0;k<len1;k++)
                                {
                                    fobj1.write(buf[k]);
                                }
                                fobj1.close();
                        }

                this.setTitle(fileName);
            }
                catch(IOException ex) 
            {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_SAVE_TEXTActionPerformed
	
    private void srtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srtfActionPerformed
     filter = new FileNameExtensionFilter("rtf file","rtf");
           fc.addChoosableFileFilter(filter);
           fc.setDialogTitle("SAVE RTF FILE");
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) 
            {
                fileName = fc.getSelectedFile().getAbsolutePath();
                // get meta of text
                StyledDocument doc = (StyledDocument) jTextPane1.getDocument();
                // convert to richtext format
                RTFEditorKit kit = new RTFEditorKit();
                BufferedOutputStream out;
            try {
                    out = new BufferedOutputStream(new FileOutputStream(fileName));
                    // save content to file
                    kit.write(out, doc, doc.getStartPosition().getOffset(), doc.getLength());
                    out.flush();
                    out.close();
                    this.setTitle(fileName);
                } 
            catch (IOException | BadLocationException e) {
                System.out.println("Err:" + e.toString());
            }
        }
    }//GEN-LAST:event_srtfActionPerformed

    private void ortfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ortfActionPerformed
                jTextPane1.setText("");
                fc.setDialogTitle("OPEN RTF FILE");
         filter = new FileNameExtensionFilter("rtf file","rtf");
            fc.addChoosableFileFilter(filter);
        // show open file dialog
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) 
            {
                fileName = fc.getSelectedFile().getAbsolutePath();
            } 
        else
            {
              return;
            }
        this.setTitle(fileName);
        RTFEditorKit rtf = new RTFEditorKit();
        try {
            // load file into jTextPane
            FileInputStream fi = new FileInputStream(fileName);
            rtf.read(fi, jTextPane1.getDocument(), 0);
            fi.close();
        } 
        catch (IOException | BadLocationException e) 
        {
            System.out.println("err:" + e.toString());
        }            
    }//GEN-LAST:event_ortfActionPerformed
	
	private void openwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openwordActionPerformed
        jTextPane1.setText("");
        fc.setDialogTitle("OPEN WORD DOCUMENT");
        filter = new FileNameExtensionFilter("DOCX file","docx");
            fc.addChoosableFileFilter(filter);
      // fc.setDialogTitle("Select a docx File");
            int returnVal;
            returnVal = fc.showOpenDialog(FrmMain.this); 
            if(returnVal == 1)
            {
            //log.append("Select file to view");
            }
            else
            {
                file=fc.getSelectedFile();
                this.setTitle(file.toString());
            }
            try
            {
			FileInputStream fis = new FileInputStream(file);

			XWPFDocument document = new XWPFDocument(fis);
            XWPFWordExtractor extractor = new XWPFWordExtractor(document);
                    String fileData = extractor.getText();

			List<XWPFParagraph> paragraphs = document.getParagraphs();
			
			/*System.out.println("Total no of paragraph "+paragraphs.size());
			for (XWPFParagraph para : paragraphs) 
                        {
				System.out.println(para.getText());   
                        }*/
                         StyledDocument doc = jTextPane1.getStyledDocument();
                    doc.insertString(doc.getLength(), fileData, null);
                     	fis.close();
                        System.out.println(file);
	    }
            
                catch (IOException | BadLocationException e) 
                {
			
		}
    }//GEN-LAST:event_openwordActionPerformed
	
    private void savewordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savewordActionPerformed
        filter = new FileNameExtensionFilter("DOCX file","docx");
           fc.addChoosableFileFilter(filter);
           fc.setDialogTitle("SAVE WORD DOCUMENT");
           int returnVal = fc.showSaveDialog(jTextPane1);
              if(returnVal == 1)
              {
                JOptionPane.showMessageDialog(jTextPane1,"Select file to save");
              }
            else{
                File ff=fc.getSelectedFile();
           fileName=ff.toString();
            }
              
       XWPFDocument word=new XWPFDocument();
       XWPFParagraph paragraph=word.createParagraph();
       XWPFRun run=paragraph.createRun();
       Font f=jTextPane1.getFont();

       //String hex = Integer.toHexString(selectColor.getRGB() & 0xffffff);
       //String hex = String.format("%02x%02x%02x", selectColor.getRed(),selectColor.getGreen(),selectColor.getBlue());  
       run.setFontFamily(f.getFamily());
       run.setFontSize(Integer.parseInt(jcbSelectSize.getSelectedItem().toString()) );
       //run.setColor(hex);
       
       
           try {
               run.setColor(String.valueOf(Color.decode(selectColor.toString())));
       run.setText(jTextPane1.getText());
               FileOutputStream wri;
               wri=new FileOutputStream(fileName);
               word.write(wri);
               wri.close();
               this.setTitle(fileName);
           } catch (FileNotFoundException ex) {
               //log.append("File not found");
           } catch (IOException ex) {
              // log.append("File Error");
           }
    }//GEN-LAST:event_savewordActionPerformed

    private void opdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opdfActionPerformed
        PdfReader reader = null;
        String textFromPage = null;
        fc.setDialogTitle("OPEN PDF DOCUMENT");
       filter = new FileNameExtensionFilter("PDF","pdf");
        fc.addChoosableFileFilter(filter);
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) 
                        {
                            fileName = fc.getSelectedFile().getAbsolutePath();
                        } 
            try 
            {
                reader = new PdfReader(fileName);
                textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);
            }
            catch (IOException ex ) 
            {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (NullPointerException ex)
            {
            
            }
        jTextPane1.setText(textFromPage);
        this.setTitle(fileName);
        //reader.close();
    }//GEN-LAST:event_opdfActionPerformed

    private void spdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spdfActionPerformed
        Document document = new Document();
        PdfDocument doc=new PdfDocument();
        fc.setDialogTitle("SAVE PDF DOCUMENT");
        filter = new FileNameExtensionFilter("PDF","pdf");
        fc.addChoosableFileFilter(filter);
        Font f=jTextPane1.getFont();
           if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) 
                        {
                            fileName = fc.getSelectedFile().getAbsolutePath();
                        } 
           this.setTitle(fileName);
             try {
                 PdfWriter.getInstance(document, new FileOutputStream(new File(fileName)));
                    document.open();
                    Paragraph p = new Paragraph();
                    BaseFont bf;
                    bf= BaseFont.createFont(f.getFontName(), f.getFontName(), BaseFont.EMBEDDED);
                    //bf= BaseFont.createFont(f.getFontName(),BaseFont.getDocumentFonts(null),BaseFont.EMBEDDED);
                    p.add(jTextPane1.getText());
                    //p.setFont(jTextPane1.getFont());
                    p.add(bf.getPostscriptFontName());
                    document.add(p);

                } catch (DocumentException | FileNotFoundException  ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }catch(NullPointerException ex){
                
            }
                    document.close();
    }//GEN-LAST:event_spdfActionPerformed

    private void rahtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rahtmlActionPerformed
                  String pass=filelocaton;
                     new web3(pass).setVisible(true);
    }//GEN-LAST:event_rahtmlActionPerformed
	
	private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      About ab= new About();
      ab.setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void jTextPane1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyTyped
        lblStatus.setText("Typing: " + evt.getKeyChar());
    }//GEN-LAST:event_jTextPane1KeyTyped

    private void jTextPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPane1MouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3)
        {
            jPopupMenu1.show(jTextPane1, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTextPane1MouseReleased

    private void jTextPane1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextPane1CaretUpdate
        int pos = jTextPane1.getCaretPosition();
        Element map = jTextPane1.getDocument().getDefaultRootElement();
        // get position of cursor on TextPane
        int row = map.getElementIndex(pos);
        Element lineElem = map.getElement(row);
        int col = pos - lineElem.getStartOffset();
        // show row and col
        lblPosition.setText("At: row " + row + " col " + col);
    }//GEN-LAST:event_jTextPane1CaretUpdate

    private void time_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_dateActionPerformed
       String months[]={
		"Jan","Feb","Mar","Apr",
		"May","Jun","Jul","Aug",
		"Sep","Oct","Nov","Dec"};
        GregorianCalendar gcalendar=new GregorianCalendar();
		String h=String.valueOf(gcalendar.get(Calendar.HOUR));
		String m=String.valueOf(gcalendar.get(Calendar.MINUTE));
		String s=String.valueOf(gcalendar.get(Calendar.SECOND));
		String date=String.valueOf(gcalendar.get(Calendar.DATE));
		String mon=months[gcalendar.get(Calendar.MONTH)];
		String year=String.valueOf(gcalendar.get(Calendar.YEAR));
		String hms="Time"+" - "+h+":"+m+":"+s+"  Date"+"  -  "+date+"  "+mon+" "+year;
                //jTextPane1.setText(jTextPane1.getText()+hms);
                jTextPane1.replaceSelection(hms);
    }//GEN-LAST:event_time_dateActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(fc);
                    SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                  SwingUtilities.updateComponentTreeUI(fc);
                    SwingUtilities.updateComponentTreeUI(this);
            /*for(Frame frame:Frame.getFrames())
                    for(Window childWindow : Window.getOwnerlessWindows())
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");*/
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(fc);
                    SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(fc);
                    SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(fc);
                    SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
            
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
         
       UndoManager undoManager = new UndoManager();
   jTextPane1.getDocument().addUndoableEditListener(undoManager);
    }//GEN-LAST:event_undoActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redoActionPerformed

    private void loadFont() {
    GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
    // get all font name 
    String[] fontNames = gEnv.getAvailableFontFamilyNames();
    //Font[] fontNames = gEnv.getAllFonts();
        // load to combobox
    ComboBoxModel model = new DefaultComboBoxModel(fontNames);
    jcbFont.setModel(model);
}
    
    public static void main(String args[]) throws UnsupportedLookAndFeelException 
    {
       try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMain().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SAVE_TEXT;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem bi;
    private javax.swing.JMenuItem biu;
    private javax.swing.JMenuItem bold;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelectColor;
    private javax.swing.JMenuItem bu;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem italic;
    private javax.swing.JMenuItem iu;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox jcbFont;
    private javax.swing.JComboBox jcbSelectSize;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem opdf;
    private javax.swing.JMenuItem open_text;
    private javax.swing.JMenuItem openword;
    private javax.swing.JMenuItem ortf;
    private javax.swing.JMenuItem past;
    private javax.swing.JMenuItem rahtml;
    private javax.swing.JMenuItem redo;
    private javax.swing.JMenuItem regular;
    private javax.swing.JMenuItem saveword;
    private javax.swing.JMenuItem selectall;
    private javax.swing.JMenuItem spdf;
    private javax.swing.JMenuItem srtf;
    private javax.swing.JMenuItem time_date;
    private javax.swing.JMenuItem underline;
    private javax.swing.JMenuItem undo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
