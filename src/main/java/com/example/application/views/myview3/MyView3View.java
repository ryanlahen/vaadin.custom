package com.example.application.views.myview3;

import com.example.application.components.avataritem.AvatarItem;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@PageTitle("My View3")
@Route(value = "my-view3", layout = MainLayout.class)
@AnonymousAllowed
public class MyView3View extends Composite<VerticalLayout> {

    public MyView3View() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        TabSheet tabSheet = new TabSheet();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        MultiSelectListBox textItems = new MultiSelectListBox();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        Details details = new Details();
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        MessageList messageList = new MessageList();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        VerticalLayout layoutColumn5 = new VerticalLayout();
        Paragraph textMedium = new Paragraph();
        MultiSelectListBox avatarItems = new MultiSelectListBox();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow3.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        tabSheet.setWidth("100%");
        setTabSheetSampleData(tabSheet);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        layoutColumn2.getStyle().set("flex-grow", "1");
        textItems.setWidth("min-content");
        setMultiSelectListBoxSampleData(textItems);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        details.setWidth("100%");
        setDetailsSampleData(details);
        checkboxGroup.setLabel("Checkbox Group");
        checkboxGroup.setWidth("min-content");
        checkboxGroup.setItems("Order ID", "Product Name", "Customer", "Status");
        checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        messageList.setWidth("100%");
        setMessageListSampleData(messageList);
        layoutColumn4.getStyle().set("flex-grow", "1");
        layoutColumn5.setWidthFull();
        layoutColumn4.setFlexGrow(1.0, layoutColumn5);
        layoutColumn5.setWidth("100%");
        layoutColumn5.getStyle().set("flex-grow", "1");
        textMedium.setText("Lorem ipsum dolor sit amet");
        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        avatarItems.setWidth("min-content");
        setAvatarItemsSampleData(avatarItems);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.setHeight("min-content");
        getContent().add(layoutRow);
        layoutRow.add(layoutRow2);
        layoutRow2.add(layoutRow3);
        layoutRow3.add(tabSheet);
        getContent().add(layoutRow4);
        layoutRow4.add(layoutColumn2);
        layoutColumn2.add(textItems);
        layoutRow4.add(layoutColumn3);
        layoutColumn3.add(details);
        layoutColumn3.add(checkboxGroup);
        layoutColumn3.add(messageList);
        layoutRow4.add(layoutColumn4);
        layoutColumn4.add(layoutColumn5);
        layoutColumn5.add(textMedium);
        layoutColumn5.add(avatarItems);
        getContent().add(layoutRow5);
    }

    private void setTabSheetSampleData(TabSheet tabSheet) {
        tabSheet.add("Dashboard", new Div(new Text("This is the Dashboard tab content")));
        tabSheet.add("Payment", new Div(new Text("This is the Payment tab content")));
        tabSheet.add("Shipping", new Div(new Text("This is the Shipping tab content")));
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setMultiSelectListBoxSampleData(MultiSelectListBox multiSelectListBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        multiSelectListBox.setItems(sampleItems);
        multiSelectListBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
        multiSelectListBox.setItemEnabledProvider(item -> !Boolean.TRUE.equals(((SampleItem) item).disabled()));
    }

    private void setDetailsSampleData(Details details) {
        Span name = new Span("Sophia Williams");
        Span email = new Span("sophia.williams@company.com");
        Span phone = new Span("(501) 555-9128");
        VerticalLayout content = new VerticalLayout(name, email, phone);
        content.setSpacing(false);
        content.setPadding(false);
        details.setSummaryText("Contact information");
        details.setOpened(true);
        details.setContent(content);
    }

    private void setMessageListSampleData(MessageList messageList) {
        MessageListItem message1 = new MessageListItem("Nature does not hurry, yet everything gets accomplished.",
                LocalDateTime.now().minusDays(1).toInstant(ZoneOffset.UTC), "Matt Mambo");
        message1.setUserColorIndex(1);
        MessageListItem message2 = new MessageListItem(
                "Using your talent, hobby or profession in a way that makes you contribute with something good to this world is truly the way to go.",
                LocalDateTime.now().minusMinutes(55).toInstant(ZoneOffset.UTC), "Linsey Listy");
        message2.setUserColorIndex(2);
        messageList.setItems(message1, message2);
    }

    private void setAvatarItemsSampleData(MultiSelectListBox multiSelectListBox) {
        record Person(String name, String profession) {
        }
        ;
        List<Person> data = List.of(new Person("Aria Bailey", "Endocrinologist"), new Person("Aaliyah Butler", "Nephrologist"), new Person("Eleanor Price", "Ophthalmologist"), new Person("Allison Torres", "Allergist"), new Person("Madeline Lewis", "Gastroenterologist"));
        multiSelectListBox.setItems(data);
        multiSelectListBox.setRenderer(new ComponentRenderer(item -> {
            AvatarItem avatarItem = new AvatarItem();
            avatarItem.setHeading(((Person) item).name);
            avatarItem.setDescription(((Person) item).profession);
            avatarItem.setAvatar(new Avatar(((Person) item).name));
            return avatarItem;
        }));
    }
}
