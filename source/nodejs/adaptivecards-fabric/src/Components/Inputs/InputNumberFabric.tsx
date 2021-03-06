// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

import * as React from "react";
import * as AC from "adaptivecards";
import * as FabricUI from "office-ui-fabric-react";
import * as Shared from "../../Utils/shared";

export class InputNumberFabric extends Shared.ReactInputElement {

    private max?: number;
    private min?: number;
    private placeholder: string;

    public parse = (json: any, errors?: AC.IValidationError[]) => {
        this.value = json.value;
        this.id = AC.getStringValue(json.id);
        this.min = Shared.getIntValue(json.min);
        this.max = Shared.getIntValue(json.max);
        this.placeholder = AC.getStringValue(json.placeholder);
    }

    protected renderReact = (): JSX.Element => (
        <FabricUI.TextField
            id={this.id}
            placeholder={`${this.placeholder}`}
            value={`${this.value}`}
            type="number"
            max={this.max}
            min={this.min}
            onChange={this.handleChange}
        />
    )

    public getJsonTypeName = (): string => "Input.Number";
}
