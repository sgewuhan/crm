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
			if ("电话联系".equals(type)) {
			} else if ("公司拜访".equals(type)) {
			} else if ("售前技术".equals(type)) {
				return "“售前技术”类型的活动必须选择“商机”";
			} else if ("商务活动".equals(type)) {
				return "“商务活动”类型的活动必须选择“商机”";
			} else if ("技术服务".equals(type)) {
			} else if ("服务跟踪".equals(type)) {
			} else if ("市场活动".equals(type)) {
			} else if ("内部培训".equals(type)) {

			}
		}

		return null;
	}

}
