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

import org.openmrs.module.kenyacore.metadata.bundle.AbstractMetadataBundle;
import org.springframework.stereotype.Component;

import static org.openmrs.module.kenyacore.metadata.bundle.CoreConstructors.*;

/**
 * Example metadata bundle
 */
@Component
public class ExampleMetadata extends AbstractMetadataBundle {

	public static class _EncounterType {
		public static final String EXAMPLE = "d69dedbd-3933-4e44-8292-bea939ce980a";
        public static final String ADHERENCE = "155c23a5-a6e3-4d33-aceb-7a1a735c51de";
	}

	public static class _Form {
		public static final String EXAMPLE = "b694b1bc-2086-47dd-a4ad-ba48f9471e4b";
        public static final String ADHERENCE = "db64f32b-1ce5-4767-a0d1-45eeb6b81eb8";
	}

	/**
	 * @see org.openmrs.module.kenyacore.metadata.bundle.AbstractMetadataBundle#install()
	 */
	@Override
	public void install() {
		install(encounterType("Example encounter", "Just an example", _EncounterType.EXAMPLE));
        install(encounterType("Adherence encounter", "Adherence visit details", _EncounterType.ADHERENCE));

		install(form("Example form", null, _EncounterType.EXAMPLE, "1", _Form.EXAMPLE));
        install(form("Adherence form", null, _EncounterType.ADHERENCE, "1", _Form.ADHERENCE));
	}
}