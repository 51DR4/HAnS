package se.ch.HAnS.actions.newFile;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import org.jetbrains.annotations.NotNull;
import se.ch.HAnS.AnnotationIcons;

public class CreateNewFileAction extends CreateFileFromTemplateAction implements DumbAware {
    public CreateNewFileAction() {
        super("Embedded Feature Annotation Files", "Create new feature mappings", AnnotationIcons.FileType);
    }

    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.@NotNull Builder builder) {
        builder.setTitle("Embedded Feature Annotation Files")
                .setValidator(null)
                .addKind("Model", AnnotationIcons.FileType, EFAFileTemplateManager.FEATURE_MODEL_FILE)
                .addKind("Folder mapping", AnnotationIcons.FileType, EFAFileTemplateManager.FEATURE_TO_FOLDER_FILE)
                .addKind("File mapping", AnnotationIcons.FileType, EFAFileTemplateManager.FEATURE_TO_FILE_FILE);
    }

    @Override
    protected String getActionName(PsiDirectory directory, String newName, String templateName) {
        if (newName == null) newName = "";
        return "Create" + newName;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CreateNewFileAction;
    }
}
