// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

import * as React from "react";
import * as AC from "adaptivecards";
import * as FabricUI from "office-ui-fabric-react";
import * as Shared from "../../Utils/shared";

export class InputToggleFabric extends Shared.ReactInputElement {

    private valueOn: string;
    private valueOff: string;

    public parse = (json: any, errors?: AC.IValidationError[]) => {
        this.id = AC.getStringValue(json.id);
        this.value = json.value;
        this.valueOn = AC.getStringValue(json.valueOn);
        this.valueOff = AC.getStringValue(json.valueOff);
        this.title = AC.getStringValue(json.title);
    }

    protected renderReact = (): JSX.Element => (
        <FabricUI.Toggle
            id={this.id}
            inlineLabel={true}
            onChange={this.handleToggleChange}
            defaultChecked={this.value === this.valueOn}
            label={this.title}
            styles={{
                root: {
                    marginBottom: 0,
                    marginTop: 0,
                },
            }}
        />
    )

    public getJsonTypeName = (): string => "Input.Toggle";

    private handleToggleChange = (event: React.MouseEvent<HTMLElement> | React.ChangeEvent, checked?: boolean) => {
        this.value = checked ? this.valueOn : this.valueOff;
    }
}
