/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.keaddonexample.metadata;

//import org.openmrs.module.kenyacore.metadata.bundle.AbstractMetadataBundle;
import org.springframework.stereotype.Component;
import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
//import static org.openmrs.module.kenyacore.metadata.bundle.CoreConstructors.encounterType;
//import static org.openmrs.module.kenyacore.metadata.bundle.CoreConstructors.form;
import static org.openmrs.module.metadatadeploy.bundle.CoreConstructors.*;

/**
 * Example metadata bundle
 */
@Component
public class ExampleMetadata extends AbstractMetadataBundle {

	public static class _EncounterType {

        public static final String ADHERENCE = "155c23a5-a6e3-4d33-aceb-7a1a735c51de";
        public static final String ARV_THERAPY_ENCOUNTER = "aeaaa866-7ed1-455c-9002-ba40e67a9882";
        public static final String EXAMPLE = "d69dedbd-3933-4e44-8292-bea939ce980a";
        public static final String PSC_INITIAL = "3e87713a-1ccb-4ca3-a5eb-5a962f63d1b0";
	}

	public static class _Form {

        public static final String ADHERENCE = "db64f32b-1ce5-4767-a0d1-45eeb6b81eb8";
        public static final String ARV_THERAPY_FORM = "d25da84f-46ff-4349-ac7b-09d6e0622c98";
        public static final String EXAMPLE = "b694b1bc-2086-47dd-a4ad-ba48f9471e4b";
        public static final String PSC_ENROLLMENT_FORM = "f432f3a8-4350-4f26-865b-b8e74c5a55e3";
	}

	/**
	 * @see org.openmrs.module.kenyacore.metadata.bundle.AbstractMetadataBundle#install()
	 */
	@Override
	public void install() {

        //install encounter_types
        install(encounterType("Adherence encounter", "Adherence visit details", _EncounterType.ADHERENCE));
        install(encounterType("Arv Therapy Encounter", "Arv Therapy details", _EncounterType.ARV_THERAPY_ENCOUNTER));
        install(encounterType("Example encounter", "Just an example", _EncounterType.EXAMPLE));
        install(encounterType("PSC Initial encounter", "PSC Enrollment Details", _EncounterType.PSC_INITIAL));

        //Install forms

        install(form("Adherence form", null, _EncounterType.ADHERENCE, "1", _Form.ADHERENCE));
        install(form("Moh257 Arv Therapy form", null, _EncounterType.ARV_THERAPY_ENCOUNTER, "1", _Form.ARV_THERAPY_FORM));
        install(form("Moh257 Enrollment form", null, _EncounterType.PSC_INITIAL, "1", _Form.PSC_ENROLLMENT_FORM));
        install(form("Example form", null, _EncounterType.EXAMPLE, "1", _Form.EXAMPLE));
	}
}