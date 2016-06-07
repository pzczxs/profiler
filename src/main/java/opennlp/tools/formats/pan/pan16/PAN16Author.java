/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package opennlp.tools.formats.pan.pan16;

import javax.xml.bind.annotation.*;

/**
 * Created by anthony on 4/20/16.
 */

@XmlRootElement(name = "author")
@XmlAccessorType(XmlAccessType.FIELD)
public class PAN16Author {

	@XmlAttribute
	private String age_group;

	@XmlAttribute
	private String gender;

	@XmlAttribute
	private String lang;

	@XmlAttribute
	private String type;

	@XmlAttribute
	private String url;

	@XmlElement(name = "documents")
	private PAN16Documents documents;

	public String getAge_group() {
		return age_group;
	}

	public void setAge_group(String age_group) {
		this.age_group = age_group;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public PAN16Documents getDocuments() {
		return documents;
	}

	public void setDocuments(PAN16Documents documents) {
		this.documents = documents;
	}
}