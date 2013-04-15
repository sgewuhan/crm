package com.sg.crm.action.editor;

import com.sg.crm.action.data.Action;
import com.sg.ui.model.DataObject;
import com.sg.ui.part.editor.field.value.ConditionNotNullValidator;

public class ValidateOpportunity extends ConditionNotNullValidator {

	public ValidateOpportunity() {
	}

	@Override
	protected String getValidMessage(DataObject data) {
		Object type = data.getValue(Action.FIELD_TYPE);
		Object opportunity = data.getValue(Action.FIELD_OPPORTUNIY_ID);
		if (opportunity == null) {
			if ("�绰��ϵ".equals(type)) {
			} else if ("��˾�ݷ�".equals(type)) {
			} else if ("��ǰ����".equals(type)) {
				return "����ǰ���������͵Ļ����ѡ���̻���";
			} else if ("����".equals(type)) {
				return "�����������͵Ļ����ѡ���̻���";
			} else if ("��������".equals(type)) {
			} else if ("�������".equals(type)) {
			} else if ("�г��".equals(type)) {
			} else if ("�ڲ���ѵ".equals(type)) {

			}
		}

		return null;
	}

}