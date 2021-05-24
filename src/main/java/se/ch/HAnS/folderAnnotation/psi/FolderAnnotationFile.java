package se.ch.HAnS.folderAnnotation.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import se.ch.HAnS.folderAnnotation.FolderAnnotationFileType;
import se.ch.HAnS.folderAnnotation.FolderAnnotationLanguage;

public class FolderAnnotationFile extends PsiFileBase {
    public FolderAnnotationFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, FolderAnnotationLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return FolderAnnotationFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "FeatureToFolder file";
    }
}